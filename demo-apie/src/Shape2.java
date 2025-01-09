public abstract class Shape2 {
  private Color color;

  public static Shape2 create(char ref) {
    switch (ref) {
      case 'S':
        return new Square2(3.0, Color.RED);
      
      case 'C':
        return new Circle2(1.1, Color.YELLOW);

      case 'T':
        return new Triangle2(1.2, 3, Color.BLUE);

      default:
        return null;
    }
  }

  public Shape2(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  abstract public double area();
}
