public class Candy {
  public static final int RED = 0;
  public static final int BLUE = 1;
  public static final int YELLOW = 2;

  private int color;
  
  public Candy(int color) {
    this.color = color;
  }

  public int getColor() {
    return this.color;
  }

  public String getColorStr() {
    switch (this.color) {
      case Candy.RED:
        return "Red";

      case Candy.BLUE:
        return "Blue";

      case Candy.YELLOW:
        return "Yellow";

      default:
        return "Unknown";
    }
  }
}
