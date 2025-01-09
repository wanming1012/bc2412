import java.util.HashSet;

public class DemoHasSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size());

    System.out.println(strings.add("ABC"));
    System.out.println(strings.size());

    System.out.println(strings.add("XYZ"));
    System.out.println(strings.size());

    strings.remove("XYZ");
    System.out.println(strings.size());
  }
}
