import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public static enum Color {
    RED(1), YELLOW(3), BLUE(2),;

    private int index;

    private Color(int index) {
      this.index = index;
    }

    public int getIndex() {
      return this.index;
    }
  }

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Ball[Color=" + this.color + ", value=" + this.value + "]";
  }

  @Override
  public int compareTo(Ball ball) {
    if (this.color.getIndex() > ball.getColor().getIndex())
      return 1; // > 1 => swap
    else if (this.color.getIndex() == ball.getColor().getIndex()) {
      return ball.getValue() - this.value;
    }
    
    return -1;
    // if (this.color == Color.RED && ball.getColor() != Color.RED)
    //   return -1;
    // else if (this.color == Color.BLUE && ball.getColor() == Color.YELLOW)
    //   return -1;
    
    // return 1;
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.RED, 1));
    balls.add(new Ball(Color.YELLOW, 9));
    balls.add(new Ball(Color.BLUE, 7));
    balls.add(new Ball(Color.YELLOW, 3));
    balls.add(new Ball(Color.RED, 8));

    System.out.println(balls);

    Collections.sort(balls);

    System.out.println(balls);

    Collections.sort(balls, new SortByColor());
    System.out.println(balls);

    Collections.sort(balls, new SortByValue());
    System.out.println(balls);

    Collections.sort(balls, new SortByColorAndValue());
    System.out.println(balls);
  }
}
