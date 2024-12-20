public class LeetCode {
  public static void main(String[] args) {
    System.out.println(convert("PAYPALISHIRING", 3));
  }
      
  public static String convert(String s, int numRows) {
    String output = "";
    int cycle = 2 * numRows - 2;
    for (int i = 0; i < numRows; i++) {
        int j = i;
        while (j < s.length() || output.length() < s.length()) {
            output += s.charAt(j);
            j = j + cycle;
            // if (j > s.length())
            //     j -= s.length();
        }

    }
    return output;
  }

}
