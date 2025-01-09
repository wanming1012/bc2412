import java.util.Objects;

public class Book {
  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Book[name=" + this.name + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;

    if (!(obj instanceof Book))
      return false;

    Book book = (Book)obj;
    return Objects.equals(book.getName(), this.name);
  }
}
