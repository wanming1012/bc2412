public class DemoComparison {
  public static void main(String[] args) {
    char gender = 'M';
    boolean isMale = gender == 'M';
    System.out.println(isMale);

    int age = 20;

    boolean result = age < 18 || gender == 'F';
    System.out.println(result);

    boolean result2 = gender == 'M' && (age < 10 || age > 18);
    System.out.println(result2);

    boolean result3 = true && false || true;
    System.out.println(result3);

    boolean result4 = false || false && true;
    System.out.println(result4);
  }
}
