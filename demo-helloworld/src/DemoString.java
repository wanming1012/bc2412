public class DemoString {
  public static void main(String[] args) {
    char x = 'a';
    String password = "test";
    System.out.println(password.charAt(1));

    int len = password.length();
    System.out.println(len);

    String test = "";
    System.out.println(test.length());
    boolean isStringEmpty = "".equals(test);  // always use hardcoded string to call methods
    System.out.println(isStringEmpty);
    
  }
  
}
