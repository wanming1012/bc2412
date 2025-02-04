public record Book(String name, double price) {

  public static void main(String[] args) {
    Book book = new Book("Java", 10.9);
    System.out.println(book.name());
    System.out.println(book.price());
    System.out.println(new Book("Java", 10.9).equals(book));
  }
}