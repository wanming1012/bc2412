import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    // traditional
    int[] arr = new int[] {1, 2, 3, 4};

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    for (int num : arr) {
      System.out.println(num);
    }

    // Java 8 : Stream : List -> Stream -> List
    List<Integer> integers = Arrays.asList(1, 2, 3, 4);
    List<Integer> newIntegers = integers.stream() // Stream<Integer>
      .filter(e -> e % 2 == 0)
      .collect(Collectors.toList());

    System.out.println(integers);
    System.out.println(newIntegers);

    List<String> strings = Arrays.asList("abc", "defghijk", "test", "test1");
    List<String> newStrings = strings.stream()
      .filter(e -> e.length() >= 5)
      .collect(Collectors.toList());

    System.out.println(strings);
    System.out.println(newStrings);

    List<Book> books = Arrays.asList(new Book("Learn Java"), new Book("Learn C++"), new Book("Mathematics"), new Book("ANSYS"));
    List<Book> newBooks = books.stream()
      .filter(e -> e.getName().toUpperCase().indexOf("LEARN") >= 0)
      .collect(Collectors.toList());

    System.out.println(books);
    System.out.println(newBooks);

    List<String> bookNames = books.stream()
      .filter(e -> e.getName().toUpperCase().indexOf("LEARN") >= 0)
      .map(e -> e.getName())
      .collect(Collectors.toList());

    System.out.println(bookNames);

    books.stream()
      .filter(e -> e.getName().toUpperCase().indexOf("LEARN") >= 0)
      .forEach(e -> System.out.println(e.getName()));

    List<String> bookNames2 = List.of("abc", "herry", "def");
    List<Book> books2 = bookNames2.stream()
      .map(e -> new Book(e))
      .collect(Collectors.toList());

    System.out.println(books2);

    // Collections.sort()
    // Arrays.sort()
    Integer[] arr2 = new Integer[] {2, 4, -1, 1, -3};
    Arrays.sort(arr2, (n1, n2) -> n2 - n1);
    System.out.println(Arrays.toString(arr2));

    List<Integer> sortedInteger = Arrays.stream(arr2)
      .sorted((n1, n2) -> n2 - n1)
      .collect(Collectors.toList());

    System.out.println(sortedInteger);

    List<String> fruits = Arrays.asList("orange", "apple", "orange", "lemon");
    Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
    System.out.println(newFruits);

    List<String> newFruits2 = fruits.stream().distinct().collect(Collectors.toList());
    System.out.println(newFruits2);
}

  public static class Book {
    private String name;
    public Book(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Book[" + this.name + "]";
    }
  }
}
