public class DemoForLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    System.out.println("------------------");
    for (int i = 0; i < 10; i += 2) {
      System.out.println(i);
    }

    System.out.println("------------------");
    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        System.out.println(i);
      }
    }

    System.out.println("------------------");
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      sum += i;
    }
    System.out.println(sum);
 
    System.out.println("------------------");
    sum = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    System.out.println(sum);

    String str = "abcdefghijk";
    boolean isCharExist = false;
    char searchChar = 'd';
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == searchChar) {
        isCharExist = true;
        System.out.println("Character " + searchChar + " found at index " + i);
        break;
      }
    }

    if (!isCharExist) {
      System.out.println("Character " + searchChar + " does not exist");
    }

    // Test case
    // 1. "abcdefghijk" => true
    // 2. "abcefghijk" => false
    // 3. "" => false
    // 4. "abcdefghijkd" => false


    String substr = "ll";
    String str2 = "hello";
    boolean isSubstringExist = false;
    if (substr.length() > 0) {
      for (int i = 0; i <= str2.length() - substr.length(); i++) {
        if (str2.substring(i, i + substr.length()).equals(substr)) {
          isSubstringExist = true;
          break;
        }
      }
    }
    System.out.println(isSubstringExist);

    sum = 0;
    for (int i = 1; i < 11; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
      else {
        sum -= i;
      }
    }
    if (sum < 0) {
      sum = -sum;
    }

    System.out.println(sum);
  }
}
