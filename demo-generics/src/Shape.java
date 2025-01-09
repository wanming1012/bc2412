import java.util.ArrayList;

public abstract class Shape {
  abstract public double area();
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size());
    System.out.println(strings.get(1));

    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book("ABC"));
    books.add(new Book("IJK"));
    books.remove(0);
    System.out.println(books.size());
    books.add(new Book("XYZ"));
    books.remove(new Book("IJK"));
    System.out.println(books.size());
  }
}
