import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {
  public static void main(String[] args) {
    Function<String, Integer> stringLength = s -> s.length();
    System.out.println(stringLength.apply("hello"));

    BiFunction<String, String, Integer> totalLength = (s1, s2) -> s1.length() + s2.length();
    System.out.println(totalLength.apply("Hello", "World"));

    Consumer<String> printString = s -> System.out.println("The String is " + s);
    printString.accept("test");

    Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) + 1;
    System.out.println(randomMarkSixNumber.get());

    // Before java 8, Interface -> Class -> Object
    // After java 8, Interface -> Object
    Swimable lucas = () -> System.out.println("Lucas is swimming");
    lucas.swim();

    // Lambda Assumption: FunctionalInterface -> one method only -> lambda expression

    MathOperation add = (x, y) -> x + y;
    MathOperation substract = (x, y) -> x - y;
    MathOperation multiply = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;
    System.out.println(add.operate(10, 20));
    System.out.println(substract.operate(10, 20));
    System.out.println(multiply.operate(10, 20));
    System.out.println(divide.operate(10, 20));

    SuperFunction<Integer, Integer, Integer, Integer> sum = (s1, s2, s3) -> s1 + s2 + s3;
    System.out.println(sum.apply(10, 20, 30));

    SuperFunction<Integer, Integer, Integer, Double> average = (s1, s2, s3) -> BigDecimal.valueOf(sum.apply(s1, s2, s3)).divide(BigDecimal.valueOf(3)/*, new MathContext(6, RoundingMode.HALF_UP)*/).doubleValue();

    System.out.println(average.apply(3, 1, 8));

    List<Book> books = new ArrayList<>();

    books.add(new Book(1));
    books.add(new Book(5));
    books.add(new Book(3));

    for (Book book : books) {
      System.out.println(book.getId());
    }

    books.forEach(b -> System.out.println(b.getId()));

    books.forEach(b -> {
      String message = "hello";
      System.out.println(b.getId() + " " + message);
    });

    Map<String, String> fruitMap = new HashMap<>();
    fruitMap.put("orange", "abc");
    fruitMap.put("apple", "def");
    fruitMap.forEach((k, v) -> System.out.println(k + ", " + v));

    // Predicate
    // x > 8 -> boolean
    // x -> x > 8 -> Predicate

    Predicate<Integer> isLargerThan8 = x -> x > 8;

    System.out.println(isLargerThan8.test(9));
    System.out.println(isLargerThan8.test(8));

    Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

    System.out.println(isEvenNumber.test(8));
    System.out.println(isEvenNumber.test(9));

    System.out.println(isLargerThan8.and(isEvenNumber).test(10));

    books.removeIf(b -> b.getId() < 3);
    books.forEach(b -> System.out.println(b.getId()));

    fruitMap.merge("lemon", "xyz", (oldV, newV) -> oldV + newV);
    fruitMap.merge("orange", "ijk", (oldV, newV) -> oldV + newV);
    fruitMap.merge("apple", "mno", (oldV, newV) -> null); // null result => remove item
    fruitMap.forEach((k, v) -> System.out.println(k + ", " + v));

    UnaryOperator<String> toUpperCase = s -> s.toUpperCase(); // Function<String, String>
    System.out.println(toUpperCase.apply("Hello"));

  }

  public static Integer sum(Integer d1, Integer d2, Integer d3) {
    return d1 + d2 + d3;
  }

  public static class Book {
    private int id;
    public Book(int id) {
      this.id = id;
    }
    public int getId() {
      return this.id;
    }
  }

  // consumer
  public static void printString(String s) {
    System.out.println("The String is " + s);
  }

  // supplier
  public static int randomMarkSixNumber() {
    return new Random().nextInt(49) + 1;
  }

  // function
  public static Integer stringLength(String s) {
    return s.length();
  }
}
