import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMap {

  public static class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Book[id=" + this.id + ", name=" + this.name + "]";
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(this.id);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;

      if (!(obj instanceof Book))
        return false;

      Book book = (Book)obj;
      return Objects.equals(this.id, book.getId()) && Objects.equals(this.name, book.getName());
    }
  }

  public static void main(String[] args) {
    HashMap<String, Integer> fruitMap = new HashMap<>();
    fruitMap.put("Apple", 1);

    System.out.println(fruitMap);
    System.out.println(fruitMap.size());

    fruitMap.put("APPLE", 3);
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());

    for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    for (String key : fruitMap.keySet()) {
      System.out.println(key);
    }

    for (Integer value : fruitMap.values()) {
      System.out.println(value);
    }

    System.out.println(fruitMap.get("Apple"));
    System.out.println(fruitMap.get("Test"));

    System.out.println(fruitMap.containsKey("Apple"));
    System.out.println(fruitMap.containsKey("Test"));
    System.out.println(fruitMap.containsValue(3));

    Integer value = fruitMap.get("Apple");
    if (value != null)
      fruitMap.put("Apple", value + 1);

    System.out.println(fruitMap);

    fruitMap.put("Orange", null);
    System.out.println(fruitMap);

    fruitMap.put(null, 99);
    System.out.println(fruitMap);

    System.out.println(fruitMap.getOrDefault("Durian", 0));
    fruitMap.put("Durian", fruitMap.getOrDefault("Durian", 0) + 1);

    System.out.println(fruitMap.remove("APPLE"));
    System.out.println(fruitMap);

    fruitMap.clear();
    System.out.println(fruitMap.isEmpty());

    Book book1 = new Book(1, "ABC");
    Book book2 = new Book(2, "IJK");
    Book book3 = new Book(3, "DEF");

    HashMap<Integer, Book> bookMap = new HashMap<>();
    bookMap.put(book1.getId(), book1);
    bookMap.put(book2.getId(), book2);
    bookMap.put(book3.getId(), book3);

    System.out.println(bookMap);

    HashMap<Book, Integer> bookMap2 = new HashMap<>();
    bookMap2.put(book1, bookMap2.getOrDefault(book1, 0) + 1);
    bookMap2.put(book2, bookMap2.getOrDefault(book2, 0) + 1);
    bookMap2.put(book3, bookMap2.getOrDefault(book3, 0) + 1);

    Book book4 = new Book(3, "DEF");
    bookMap2.put(book4, bookMap2.getOrDefault(book4, 0) + 1);
    System.out.println(bookMap2);
  }
}
