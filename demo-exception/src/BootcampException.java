public class BootcampException extends RuntimeException {
  
  public static void main(String[] args) {
    try {
      System.out.println(test(2, 0));
      System.out.println(test(-1, 0));
    } catch (BootcampException e) {
      System.out.println("Cannot handle -ve numbers");
    }
  }
  
  public static int test(int x, int y) {
    if (x < 0 || y < 0)
      throw new BootcampException();

    return x + y;
  }
}
