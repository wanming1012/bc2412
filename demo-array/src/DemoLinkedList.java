import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("ABC");
    strings.add("DEF");
    strings.add("ABC");
    System.out.println(strings.size());
    System.out.println(strings);
    strings.remove(0);
    System.out.println(strings);
    strings.remove("ABC");
    System.out.println(strings);
    strings.add("Oscar");
    strings.add("Jenny");
    strings.remove();
    System.out.println(strings);
    System.out.println(strings.contains("Jenny"));
    System.out.println(strings.contains("Matthew"));
  }
}
