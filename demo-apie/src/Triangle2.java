import java.math.BigDecimal;
import java.util.Objects;

public class Triangle2 extends Shape2 {
  private double base;
  private double height;

  public Triangle2(double base, double height, Color color) {
    super(color);
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return this.base;
  }

  public double getHeight() {
    return this.height;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Triangle2))
      return false;

    Triangle2 triangle = (Triangle2) obj;
    return Objects.equals(this.base, triangle.getBase())
      && Objects.equals(this.height, triangle.getHeight());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.base, this.height);
  }

  @Override
  public String toString() {
    return "Triangle[base=" + this.base + ", height=" + this.height + "]";
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.base)
      .multiply(BigDecimal.valueOf(this.height))
      .divide(BigDecimal.valueOf(2))
      .doubleValue();
  }
}
