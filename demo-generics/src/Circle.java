import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Circle))
      return false;

    Circle circle = (Circle) obj;
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
    Circle c1 = new Circle(3.0);
    System.out.println(c1.area());
    System.out.println(c1.getRadius());
    System.out.println(c1);
    System.out.println(c1.hashCode());

    Circle c2 = new Circle(3.0);
    System.out.println(c2);
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2));

    Square s1 = new Square(3.0);
    System.out.println(s1);
    System.out.println(s1.hashCode());
  }
}
