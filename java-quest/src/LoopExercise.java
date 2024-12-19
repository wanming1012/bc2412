import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++) {
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    System.out.println("---------------------------");
    for (int i = 0; i < 5; i++) {
      if (i > 0)
        System.out.print(',');
      System.out.print(i);
    }
    System.out.println();

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    System.out.println("---------------------------");
    for (int i = 2; i <= 20; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    System.out.println("---------------------------");
    for (int i = 3; i <= 20; i++) {
      if (i % 3 == 0 || i % 5 == 0)
        System.out.println(i);
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    System.out.println("---------------------------");
    int sum = 0;
    for (int i = 0; i <= 15; i++)
      sum += i;

    System.out.println(sum);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    System.out.println("---------------------------");
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0)
        evenSum++;
      else
        oddSum++;
    }
    System.out.println("Even Sum = " + evenSum + ", Odd Sum = " + oddSum);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    System.out.println("---------------------------");
    String str7 = "ijkabcpodi";
    if (str7.indexOf('d') >= 0)
      System.out.println("d is found.");
    else
      System.out.println("d is not found.");

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    System.out.println("---------------------------");
    String s8a = "abcba";
    String s8b = "cba";
    if (s8a.indexOf(s8b) >= 0)
      System.out.println("s8b is a substring.");
    else
      System.out.println("s8b is not a substring.");

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    System.out.println("---------------------------");
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for(int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9)
        count++;
    }
    System.out.println("count=" + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    System.out.println("---------------------------");
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    System.out.println("---------------------------");
    String s11 = "kLKloOOu";
    count = 0;
    for (int i = 0; i < s11.length(); i++) {
      if (s11.charAt(i) <= 'Z')
        count++;
    }
    System.out.println("count uppercase=" + count);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    System.out.println("---------------------------");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print('*');
      }
      System.out.println();
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    System.out.println("---------------------------");
    String s13 = "lrlaudbucp";
    int score = 0;
    for (int i = 0; i < s13.length(); i++) {
      switch(s13.charAt(i)) {
        case 'L':
          score += 1;
          break;
        case 'r':
          score += 3;
          break;
        case 'd':
          score += 2;
          break;
        case 'u':
          score += 4;
          break;
        default:
          score -= 1;
      }
    }
    System.out.println("Score=" + score);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    System.out.println("---------------------------");
    long[] arr14 = new long[] {1L, 4L, 9L, -4L};

    System.out.println(Arrays.toString(arr14));

    // 15. Find the max value and min value in arr14
    System.out.println("---------------------------");
    // Use One Loop + if
    long max = arr14[0], min = arr14[0];
    for (int i = 1; i < arr14.length; i++) {
      if (arr14[i] > max)
        max = arr14[i];

      if (arr14[i] < min)
        min = arr14[i];
    }
    System.out.println("Max=" + max + ", Min=" + min);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    System.out.println("---------------------------");
    float[] arr16 = new float[] {0.2f, 0.3f, 0.5f};

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]
    System.out.println(Arrays.toString(arr16));

    // 18. Count the number of target strings in the String[]
    System.out.println("---------------------------");
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    count = 0;
    for (int i = 0; i < arr18.length; i++) {
      if (target.equals(arr18[i]))
        count++;
    }
    System.out.println("count name=" + count);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    System.out.println("---------------------------");
    String s19 = "40289";
    int minIndex = 0, maxIndex = 0;
    char minC = s19.charAt(0);
    char maxC = s19.charAt(0);
    for (int i = 1; i < s19.length(); i++) {
      char c = s19.charAt(i);
      if (c > maxC) {
        maxC = c;
        maxIndex = i;
      }
      else if (c < minC) {
        minC = c;
        minIndex = i;
      }
    }
    s19 = s19.replace(maxC, ' ');
    s19 = s19.replace(minC, maxC);
    s19 = s19.replace(' ', minC);

    System.out.println(s19);

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    System.out.println("---------------------------");
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    String longestStr = arr20[0];
    for (int i = 1; i < arr20.length; i++)
      if (arr20[i].length() > longestStr.length())
        longestStr = arr20[i];

    System.out.println("Longest=" + longestStr);
    
  }
}