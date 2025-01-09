public class GeneralPrinter<T> {
  private T value;

  public GeneralPrinter(T value) {
    this.value = value;
  }
  
  public T getValue() {
    return this.value;
  }

  public String print() {
    return "This is " + value;
  }

  public static void main(String[] args) {
    Book book = new Book("Learn Java");
    GeneralPrinter<Book> printer = new GeneralPrinter<>(book);
    System.out.println(printer.print());
  }
}
