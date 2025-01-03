public class Square extends Shape {
  private double length;

  public Square(double length, String color) {
    super(color);
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  public double area() {
    return this.length * this.length;
  }
}
