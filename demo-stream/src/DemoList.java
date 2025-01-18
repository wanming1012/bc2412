import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // 1. new ArrayList<>()
    // Able to add / remove / modify
    List<String> strings1 = new ArrayList<>();
    strings1.add("ABC");
    strings1.add("DEF");
    List<String> strings2 = new ArrayList<>(Arrays.asList("ABC", "DEF"));
    strings2.add("IJK");
    strings2.remove("DEF");
    strings2.set(0, "XYZ");

    // 2. Arrays.asList()
    // Cannot add and remove. Able to modify (array size fixed -> final)
    List<String> strings3 = Arrays.asList("ABC", "DEF", "IJK");
    //strings3.add("XYZ");  // runtime error
    //strings3.remove("IJK"); // runtime error
    strings3.set(0, "OPQ");

    // 3. List.of()
    // Cannot add / remove / modify
    List<String> strings4 = List.of("ABC", "DEF", "IJK");
    //strings4.add("XYZ"); // runtime error
    //strings4.remove("ABC"); // runtime error
    //strings4.set(0, "LLL"); // runtime error
  }
}
