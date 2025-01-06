public abstract class Shape {
  private Color color;

  public static Shape create(char ref) {
    switch (ref) {
      case 'S':
        return new Square(3.0, Color.RED);
      
      case 'C':
        return new Circle(1.1, Color.YELLOW);

      case 'T':
        return new Triangle(1.2, 3, Color.BLUE);

      default:
        return null;
    }
  }

  public Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  abstract public double area();
}
