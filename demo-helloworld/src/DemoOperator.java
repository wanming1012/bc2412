public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x = x - 1;
    x -= 1;
    x--;
    --x;
    System.out.println(x);

    int y = 10;
    y = y - 2;
    y -= 2;
    System.out.println(y);
    System.out.println(y);

    int a = 2;
    int b = (a++ + 1) * a++;
    // step 1 : (a + 1) => 3
    // step 2 : a++ => a = 3
    // step 3 : 3 * a = 9
    // step 4 : a++ => a = 4
    System.out.println(b);
    System.out.println(a);
  }
  
}
