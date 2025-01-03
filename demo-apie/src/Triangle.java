public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(double base, double height, String color) {
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

  public double area() {
    return this.base * this.height / 2.0;
  }
}
