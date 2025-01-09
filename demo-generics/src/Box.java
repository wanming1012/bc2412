import java.math.BigDecimal;

public class Box<T extends Shape> {
  private Shape[] shapes;

  public Box() {
    this.shapes = new Shape[2];
  }

  public <T extends Shape> void addShape(int index, T shape) {
    this.shapes[index] = shape;
  }

  public double totalArea() {
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Shape shape : this.shapes) {
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  public static <T extends Shape> double totalArea2(T[] shapes) {
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    Box box1 = new Box();
    box1.addShape(0, new Circle(3.0));
    box1.addShape(1, new Square(4.0));
    System.out.println(box1.totalArea());

  }
}
