import java.util.Arrays;

public class Demo2DArray {
  public static void main(String[] args) {
    int[][] arr = new int[][] {{100, 7, 9}, {101, -9, 100}};
    int[] max = new int[arr.length];
    int[] min = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] > max[i])
          max[i] = arr[i][j];

        if (arr[i][j] < min[i])
          min[i] = arr[i][j];
      }
    }
    System.out.println(Arrays.toString(max));
    System.out.println(Arrays.toString(min));
    System.out.println(max);
    System.out.println(min);
    min = max;
    System.out.println(min);
    System.out.println(Arrays.toString(min));
    min[0] = 999;
    System.out.println(Arrays.toString(max));
  }
}
