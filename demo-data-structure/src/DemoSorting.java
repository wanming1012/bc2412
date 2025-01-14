import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 3, 10, -4, 2);

    Collections.sort(integers);
    System.out.println(integers);
  }

  public static int[] allZero(int[] arr) {
    for (int i = 0; i < arr.length; i++)
      arr[i] = 0;

    return arr;
  }
}
