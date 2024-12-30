public class String1 {
  private char[] chars;

  String1(String string) {
    char[] newChars = new char[string.length()];
    for (int i = 0; i < string.length(); i++) {
      newChars[i] = string.charAt(i);
    }
    this.chars = newChars;
  }

  public char charAt(int index) {
    return chars[index];
  }

  public int length() {
    return chars.length;
  }

  public boolean startsWith(char c) {
    return chars[0] == c;
  }

  public static void main(String[] args) {
    String1 str = new String1("abc");
    System.out.println(str.charAt(1));
    System.out.println(str.length());
    System.out.println(str.startsWith('a'));
  }
}
