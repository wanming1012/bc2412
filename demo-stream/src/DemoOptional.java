import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    System.out.println(concat(null, "ABC").orElse("Error"));
    System.out.println(concat("ABC", null));
    System.out.println(concat("ABC", "DEF"));
  }

  // if a or b is null, return null optional instead of throw exception
  // Optional should be used for return type only
  public static Optional<String> concat(String a, String b) {
    if (a == null || b == null)
      return Optional.empty();

    return Optional.of(a.concat(b));
  }
}
