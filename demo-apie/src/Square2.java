import java.math.BigDecimal;
import java.util.Objects;

public class Square2 extends Shape2 {
  private double length;

  public Square2(double length, Color color) {
    super(color);
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Square2))
      return false;

    Square2 square = (Square2) obj;
    return Objects.equals(this.length, square.getLength());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.length);
  }

  @Override
  public String toString() {
    return "Square[length=" + this.length + "]";
  }
  
  @Override
  public double area() {
    return BigDecimal.valueOf(this.length)
      .multiply(BigDecimal.valueOf(this.length))
      .doubleValue();
  }
}
