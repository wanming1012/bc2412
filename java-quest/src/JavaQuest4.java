public class JavaQuest4 {
  /**
   * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
   * and divisible by 2 (Search it from 1)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
  public static void main(String[] args) {
    // Print first ten numbers, which fulfill the followings criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0
    int outputCount = 0;
    for (int i = 2; i < 100; i += 2) {
      // code here ...
      if (i % 3 == 0) {
        System.out.println(i);
        outputCount++;
        if (outputCount == 10)
          break;
      }
    }
  }
}