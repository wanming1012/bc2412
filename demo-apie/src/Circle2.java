import java.math.BigDecimal;
import java.util.Objects;

public class Circle2 extends Shape2 {
  private double radius;

  public Circle2(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Circle2))
      return false;

    Circle2 circle = (Circle2) obj;
    return Objects.equals(this.radius, circle.getRadius());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius);
  }

  @Override
  public String toString() {
    return "Circle[radius=" + this.radius + "]";
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(Math.PI)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(this.radius))
      .doubleValue();
  }

  public static void main(String[] args) {
    Circle2 c1 = new Circle2(3.0, Color.RED);
    System.out.println(c1.area());
    System.out.println(c1.getColor());
    System.out.println(c1.getRadius());
    System.out.println(c1);
    System.out.println(c1.hashCode());

    Circle2 c2 = new Circle2(3.0, Color.RED);
    System.out.println(c2);
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2));

    Square2 s1 = new Square2(3.0, Color.RED);
    System.out.println(s1);
    System.out.println(s1.hashCode());

    Shape2[] shapes = new Shape2[3];
    shapes[0] = Shape2.create('C');
    shapes[1] = Shape2.create('S');
    shapes[2] = Shape2.create('T');

    for (Shape2 shape : shapes)
      System.out.println("Area of " + shape.toString() + " = " + shape.area());
  }
}
