import java.util.Comparator;

public class SortByColor implements Comparator<Ball>{
  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getColor().getIndex() - b2.getColor().getIndex();
  }
}
