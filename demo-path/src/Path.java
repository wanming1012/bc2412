import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Path {
  private char id;
  private final Map<Path, Integer> distances = new HashMap<>();
  public static final Map<Character, Path> paths = new HashMap<>();
  public static final Map<Path, Path> reversePaths = new HashMap<>();
  
  public Path(char id) {
    this.id = id;
    Path.paths.put(id, this);
  }

  public char getId() {
    return this.id;
  }

  public void add(Path destination, int distance) {
    this.distances.put(destination, distance);
  }

  // public int getDistance(char id) {
  //   Integer distance = distances.get(new Path(id));
  //   if (distance != null)
  //     return distance.intValue();
    
  //   return -1;
  // }

  // public boolean hasDestination(char id) {
  //   return distances.containsKey(new Path(id));
  // }

  public int findShortestPath(char destId) {
    int minDistance = -1;
    for (Map.Entry<Path, Integer> entry : distances.entrySet()) {
      int distance;
      Path dest = entry.getKey();
      if (dest.getId() == destId) {
        distance = entry.getValue();
      }
      else {
        distance = dest.findShortestPath(destId);
        if (distance == -1) // no destination
          continue;
        
        distance += entry.getValue().intValue();
      }

      if (minDistance == -1 || distance < minDistance) {
        minDistance = distance;
        reversePaths.put(dest, this);
      }
    }
    return minDistance;
  }

  public static void addPath(char fromId, char destId, int distance) {
    Path from = paths.get(fromId);
    if (from == null) {
      from = new Path(fromId);
    }

    Path dest = paths.get(destId);
    if (dest == null) {
      dest = new Path(destId);
    }

    from.add(dest, distance);
  }

  public static int findShortestPath(char fromId, char destId) {
    Path from = paths.get(fromId);
    Path dest = paths.get(destId);
    if (from == null || dest == null)
      return -1;
    
    int distance = from.findShortestPath(destId);

    Path current = dest;
    StringBuilder shortestPath = new StringBuilder();
    do {
      if (shortestPath.length() > 0)
        shortestPath.insert(0, " -> ");

      shortestPath.insert(0, current.getId());
      current = reversePaths.get(current);
    } while (current != null);
    System.out.println(shortestPath);

    return distance;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Path))
      return false;

    Path node = (Path) obj;
    return Objects.equals(this.id, node.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id);
  }

  @Override
  public String toString() {
    return "Node[id=" + this.id + ", destinations=" + this.distances.size() + "]";
  }
}
