import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

// ! Dijkstra's Algorithm (戴克斯特拉算法)
public class DistanceManager {
  List<Distance> distances = new LinkedList<>();

  public DistanceManager(List<Distance> distances) {
    this.distances = distances;
  }

  public DistanceManager(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] data = line.split(",");
        Distance distance = Distance.of( //
            data[0].trim(), //
            data[1].trim(), //
            Integer.parseInt(data[2].trim()) //
        );
        distances.add(distance);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private Path shortestPath(String start, String end) {
    return new Dijkstra(this.distances).shortest(start, end);
  }

  public static class Dijkstra {
    private final Map<String, Map<String, Integer>> graph;
    private final Map<String, Integer> minCostMap;
    private final Map<String, String> previousMap;
    private PriorityQueue<String> pQueue;

    public Dijkstra(List<Distance> distances) {
      this.graph = new HashMap<>();
      this.minCostMap = new HashMap<>();
      this.previousMap = new HashMap<>();
      Comparator<String> ascending =
          (s1, s2) -> Integer.compare(minCostMap.get(s1), minCostMap.get(s2));
      this.pQueue = new PriorityQueue<>(ascending);

      for (Distance d : distances) {
        this.graph.putIfAbsent(d.getPoint1(), new HashMap<>());
        this.graph.putIfAbsent(d.getPoint2(), new HashMap<>());
        this.graph.get(d.getPoint1()).put(d.getPoint2(), d.getValue());
        this.graph.get(d.getPoint2()).put(d.getPoint1(), d.getValue());
      }
    }

    private List<String> reversePath(Map<String, String> previous, String end) {
      List<String> paths = new ArrayList<>();
      for (String at = end; at != null; at = previous.get(at)) {
        paths.add(at);
      }
      Collections.reverse(paths);
      return paths;
    }

    public Path shortest(String start, String end) {
      for (String node : this.graph.keySet()) {
        minCostMap.put(node, Integer.MAX_VALUE);
      }
      minCostMap.put(start, 0);
      pQueue.add(start);
      int minDistance = Integer.MAX_VALUE;

      while (!pQueue.isEmpty()) {
        String current = pQueue.poll();
        if (current.equals(end)) {
          return new Path(this.reversePath(previousMap, end),
              minCostMap.get(end));
        }
        for (Map.Entry<String, Integer> neighbor : this.graph.get(current)
            .entrySet()) {
          String nextNode = neighbor.getKey();
          int newDist = minCostMap.get(current) + neighbor.getValue();
          if (nextNode.equals(end) && newDist < minDistance) {
            minDistance = newDist;
          }

          if (newDist < minCostMap.get(nextNode) && newDist <= minDistance) {
            minCostMap.put(nextNode, newDist);
            previousMap.put(nextNode, current);
            pQueue.add(nextNode);
          }
        }
      }
      return null; // No path found
    }

  }

  public static class Distance {
    private String point1;
    private String point2;
    private int value;

    public static Distance of(String point1, String point2, int value) {
      return new Distance(point1, point2, value);
    }

    private Distance(String point1, String point2, int value) {
      this.point1 = point1;
      this.point2 = point2;
      this.value = value;
    }

    public String getPoint1() {
      return this.point1;
    }

    public String getPoint2() {
      return this.point2;
    }

    public int getValue() {
      return this.value;
    }
  }

  public static class Path {
    private List<String> points;
    private int length;

    public Path(List<String> points, int length) {
      this.points = points;
      this.length = length;
    }

    public int getLength() {
      return this.length;
    }

    public String show() {
      return "Path[" + String.join(" -> ", this.points) + "]";
    }
  }

  public static void main(String[] args) {
    DistanceManager distanceManager = new DistanceManager("c:/users/wanmi/distances.txt");
    // A,B,3
    // B,C,4
    // Y,C,7
    // A,Y,1
    // ! {A={B=3, Y=1}, B={A=3, C=4}, C={B=4, Y=7}, Y={A=1, C=7}}

    String start = "A";
    String end = "C";

    Path shortestPath = distanceManager.shortestPath(start, end);
    if (shortestPath != null) {
      System.out.println("Shortest distance: " + shortestPath.getLength());
      System.out.println("Shortest path: " + shortestPath.show());
    } else {
      System.out.println("No path found!");
    }
  }
}
