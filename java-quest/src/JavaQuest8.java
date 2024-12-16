/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    //int[] nums = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    //int[] nums = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    //int[] nums = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240
    //int[] nums = new int[] {100};

    // Your program should be able to handle all the above test case.
    if (nums.length >= 2) {
      int max = nums[0];
      int secondMax = nums[0];
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] > max) {
          secondMax = max;
          max = nums[i];
        } else if (nums[i] >= secondMax) {
          secondMax = nums[i];
        }
      }

      System.out.println("Second Max = " + secondMax);
    } else {
      System.out.println("Need at least 2 elements in array!");
    }
    // code here ...
  }
}