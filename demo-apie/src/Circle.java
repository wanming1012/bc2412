public class Circle extends Shape {
  private double radius;

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double area() {
    return Math.PI * this.radius * this.radius;
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.0, "Red");
    System.out.println(c1.area());
    System.out.println(c1.getColor());
    System.out.println(c1.getRadius());
  }
}
