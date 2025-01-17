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

  public int getNumOfBooks() {
    return this.books.length;
  }

  public void removeBook(Book book) {
    Book[] newBooks = new Book[this.books.length - 1];
    boolean found = false;
    int index = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (!found && this.books[i] == book) {
        found = true;
      }
      else {
        newBooks[index++] = this.books[i];
      }
    }
    this.books = newBooks;
  }

  public Book[] searchByTitle(String title) {
    Book[] tempList = new Book[this.books.length];
    int index = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().indexOf(title) != -1) {
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

    for (Book book : library.searchByTitle("Java")) {
      System.out.println(book.getTitle() + ", " + book.getAuthor());
    }
  }
}
