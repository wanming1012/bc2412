import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number");
    int num = scanner.nextInt();
    //System.out.println("num=" + num);
    int totalMins = 0;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < 24; j++) {
        totalMins += 60;
      }
    }
    System.out.println(totalMins);
  }
}
