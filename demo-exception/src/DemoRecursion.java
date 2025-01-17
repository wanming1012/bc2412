public class DemoRecursion {
  public static void main(String[] args) {
    System.out.println(multiply(40));
  }

  public static long multiply(long value) {
    if (value <= 3)
      return value;

    return value * multiply(value - 2);
  }
}
