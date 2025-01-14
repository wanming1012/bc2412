import java.util.Comparator;

public class SortByColorAndValue implements Comparator<Ball> {
  @Override
  public int compare(Ball b1, Ball b2) {
    if (b1.getColor().getIndex() > b2.getColor().getIndex())
      return 1; // > 1 => swap
    else if (b1.getColor().getIndex() == b2.getColor().getIndex()) {
      return b2.getValue() - b1.getValue();
    }
    
    return -1;
  }
}
