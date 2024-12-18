import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) {
    String s = "hello";
    char target = 'l';
    int i = 0;
    while (i < s.length()) {
      if (s.charAt(i) == target) {
        System.out.println(i);
        break;
      }
      i++;
    }

    int[] marksixArr = new int[6];
    int j = 0;
    while(j < marksixArr.length) {
      int newNum = new Random().nextInt(49) + 1;
      if (!isDuplicated(marksixArr, newNum)) {
        marksixArr[j] = newNum;
        j++;
        continue;
      }
    }
      

    System.out.println(Arrays.toString(marksixArr));


    int min = 1;
    int max = 100;
    int answer = new Random().nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    int input = -1;
    while (input != answer) {
      System.out.println("Please pick a number between " + min + " and " + max);
      input = Integer.valueOf(scanner.nextLine());
      if (input > min && input < answer) {
        min = input + 1;
      }
      else if (input > answer && input < max) {
        max = input - 1;
      }
    }

    System.out.println("Yes, answer is " + answer);
  }

  public static boolean isDuplicated(int[] arr, int newNum) {
    for(int i = 0; i < arr.length; i++) {
      if (newNum == arr[i])
        return true;
    }
    return false;
  }
}