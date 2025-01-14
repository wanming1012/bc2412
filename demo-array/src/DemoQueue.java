import java.util.LinkedList;
import java.util.Queue;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  public static void main(String[] args) {
    Queue<String> strings = new LinkedList<>();
    strings.add("Oscar");
    strings.add("Vincent");
    strings.add("Lucas");
    System.out.println(strings);

    String head = strings.poll();
    System.out.println(head);
    System.out.println(strings);

    System.out.println(strings.contains("Lucas"));
    System.out.println(strings.peek());

    strings.offer("Jenny");
    Queue<String> qq = new ArrayBlockingQueue<>(3);
    System.out.println(qq.offer("ABC"));
    System.out.println(qq.offer("ABC1"));
    System.out.println(qq.offer("ABC2"));
    System.out.println(qq.offer("ABC3"));
    System.out.println(qq);

    for (String string : strings) {
      System.out.println(string);
    }

    Collection<String> ss = new LinkedList<>();
    ss.add("ABC");
    ss.
    
  }
}
