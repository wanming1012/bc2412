public class Calculator {
  private int x;
  private int y;

  public Calculator(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }

  public int sum(int thirdNumber) {
    return this.x + this.y + thirdNumber;
  }

  public static void main(String[] args) {
    Calculator c1 = new Calculator(3, 4);
    System.out.println(c1.sum());
  }
}
