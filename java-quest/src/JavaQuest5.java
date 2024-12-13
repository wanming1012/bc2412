public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    // code here ...
    boolean found = false;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == target) {
        System.out.println("The index of the last character of " + target + " is " + i);
        found = true;
        break;
      }
    }
    if (!found)
      System.out.println("Not Found.");

  }
}