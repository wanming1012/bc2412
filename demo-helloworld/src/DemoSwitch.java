public class DemoSwitch {
  public static void main(String[] args) {
    int x = 3;
    if (x == 1) {
      System.out.println("x=1");
    } else if (x == 2) {
      System.out.println("x=2");
    } else if (x == 3) {
      System.out.println("x=3");
    } else {
      System.out.println("Somethings else ...");
    }

    switch (x) {
      case 1:
        System.out.println("x=1");
        break;
      case 2:
        System.out.println("x=2");
        break;
      case 3:
        System.out.println("x=3");
        break;
      default:
        System.out.println("Somethings else ...");
    }
  }
}
