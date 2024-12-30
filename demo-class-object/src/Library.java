public class Library {
  private Book[] books;

  public Library() {
    books = new Book[0];
  }

  public void addBook(String title, String author) {
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[this.books.length] = new Book(title, author);
    this.books = newBooks;
  }

  public Book removeByTitle(String title) {
    Book[] newBooks = new Book[this.books.length - 1];
    Book book = null;
    boolean found = false;
    int index = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (!found && title.equals(this.books[i].getTitle())) {
        book = this.books[i];
        found = true;
      }
      else {
        newBooks[index++] = this.books[i];
      }
    }
    this.books = newBooks;
    return book;
  }

  public Book[] searchByTitle(String title) {
    Book[] tempList = new Book[this.books.length];
    int index = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (title.equals(this.books[i].getTitle())) {
        tempList[index++] = this.books[i];
      }
    }

    Book[] newBooks = new Book[index];
    for (int i = 0; i < index; i++) {
      newBooks[i] = tempList[i];
    }
    return newBooks;
  }

  public static void main(String[] args) {
    Library library = new Library();

    library.addBook("Python", "Matthew");
    library.addBook("Learn Java", "Vincent");
    library.addBook("Learn Java", "Lucas");
    library.addBook("C++", "Linus");

    for (Book book : library.searchByTitle("C++")) {
      System.out.println(book.getTitle() + ", " + book.getAuthor());
    }

    for (Book book : library.searchByTitle("Learn Java")) {
      System.out.println(book.getTitle() + ", " + book.getAuthor());
    }

    Book removedBook = library.removeByTitle("Learn Java");
    if (removedBook != null) {
      System.out.println(removedBook.getTitle() + ", " + removedBook.getAuthor());
    }

    for (Book book : library.searchByTitle("Learn Java")) {
      System.out.println(book.getTitle() + ", " + book.getAuthor());
    }
  }
}
