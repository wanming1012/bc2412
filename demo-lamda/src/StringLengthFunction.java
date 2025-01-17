import java.util.function.Function;

public class StringLengthFunction implements Function<String, Integer> {
  @Override
  public Integer apply(String s) {
    return s.length();
  }

  public static void main(String[] args) {
    StringLengthFunction slf = new StringLengthFunction();
    System.out.println(slf.apply("hello"));

    Function<String, Integer> stringLength = s -> s.length();
    System.out.println(stringLength.apply("hello"));

    stringLength = slf;
    
  }
}
