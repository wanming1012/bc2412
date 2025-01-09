public class Calculator<T extends Number> {
  private T x;
  private T y;

  public Calculator(T x, T y) {
    this.x = x;
    this.y = y;
  }

  public Number sum() {
    if (this.x instanceof Byte && this.y instanceof Byte) {
      return (Byte) x + (Byte) y;
    }
    else if (this.x instanceof Short && this.y instanceof Short) {
      return (Short) x + (Short) y;
    }
    else if (this.x instanceof Integer && this.y instanceof Integer) {
      return (Integer) x + (Integer) y;
    }
    else if (this.x instanceof Long && this.y instanceof Long) {
      return (Long) x + (Long) y;
    }
    else if (this.x instanceof Float && this.y instanceof Float) {
      return (Float) x + (Float) y;
    }
    else if (this.x instanceof Double && this.y instanceof Double) {
      return (Double) x + (Double) y;
    }
    
    return null;
  }

  public static void main(String[] args) {
    Calculator<Integer> calculator = new Calculator<>(Integer.valueOf(1), Integer.valueOf(2));
    System.out.println(calculator.sum());

    Calculator<Double> calculator2 = new Calculator<>(Double.valueOf(0.1), Double.valueOf(0.2));
    System.out.println(calculator2.sum());
  }
}
