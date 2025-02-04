public class DemoSwitchExpression {
  public static void main(String[] args) {
    System.out.println(getColorValue(Color.RED));
    int x = 1;
    switch (x) {
      case 1, 2, 3 -> System.out.println("1, 2, or 3");
      case 4, 5, 6 -> System.out.println("4, 5, or 6");
      default -> System.out.println("Other");
    }
  }

  public static char getColorValue(Color color) {
    return switch (color) {
      case RED -> 'R';
      case GREEN -> 'G';
      case BLUE -> 'B';
    };
  }

  public static String getColorValue2(Color color) {
    return switch (color) {
      case RED -> {
        yield "Red.";
      }
      case GREEN -> {
        yield "Green.";
      }
      case BLUE -> {
        yield "Blue.";
      }
    };
  }

  public static enum Color {
    RED, GREEN, BLUE,;
  }
}
