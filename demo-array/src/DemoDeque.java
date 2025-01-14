import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DemoDeque {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    for (int i = 0; i < 10000000; i++) {
      strings.add("ABC" + i);
    }
    System.out.println(strings.size());
    // strings.add("ABC1");
    // strings.add("ABC2");
    // strings.add("ABC3");
    // strings.add("ABC4");
    // strings.addFirst("ABC");
    // System.out.println(strings);
    // System.out.println(strings.poll());
    // System.out.println(strings.pollLast());
    // System.out.println(strings);
  }
}
