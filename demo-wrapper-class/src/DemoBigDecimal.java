import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double result = 0.2 + 0.1;
    System.out.println(result);

    BigDecimal bd1 = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue());

    System.out.println(0.3 - 0.1);
    BigDecimal bd4 = BigDecimal.valueOf(0.3);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);
    BigDecimal bd6 = bd4.subtract(bd5);
    System.out.println(bd6.doubleValue());

    System.out.println(0.1 * 0.2);
    BigDecimal bd7 = BigDecimal.valueOf(0.1);
    BigDecimal bd8 = BigDecimal.valueOf(0.2);
    BigDecimal bd9 = bd7.multiply(bd8);
    System.out.println(bd9.doubleValue());

    System.out.println(0.3 / 0.1);
    BigDecimal bd10 = BigDecimal.valueOf(0.3);
    BigDecimal bd11 = BigDecimal.valueOf(0.1);
    BigDecimal bd12 = bd10.divide(bd11);
    System.out.println(bd12.doubleValue());

    bd10 = BigDecimal.valueOf(10);
    bd11 = BigDecimal.valueOf(3);
    bd12 = bd10.divide(bd11, new MathContext(6, RoundingMode.HALF_UP));
    System.out.println(bd12.doubleValue());

    double radius = 4.5;
    double circleArea = BigDecimal.valueOf(radius).pow(2).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    System.out.println(circleArea);
  }
}