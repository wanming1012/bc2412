import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      String name = iterator.next();
      System.out.println(name);
    }

    
  }
}
