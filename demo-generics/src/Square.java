import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape {
  private double length;

  public Square(double length) {
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Square))
      return false;

    Square square = (Square) obj;
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
