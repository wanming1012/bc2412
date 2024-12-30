public class Librarian {
  private Library library;

  public Librarian(Library library) {
    this.library = library;
  }

  public Library getLibrary() {
    return this.library;
  }

  public void addBook(String title, String author) {
    library.addBook(title, author);
  }

  public Book removeBookByTitle(String title) {
    Book[] books = library.searchByTitle(title);
    if (books.length > 0) {
      library.removeBook(books[0]);
    }
    return books[0];
  }

  public static void main(String[] args) {
    Library library = new Library();
    Librarian librarian = new Librarian(library);

    librarian.addBook("Python", "Matthew");
    librarian.addBook("Learn Java", "Vincent");
    librarian.addBook("Learn Java", "Lucas");
    librarian.addBook("C++", "Linus");

    for (Book book : library.searchByTitle("C++")) {
      System.out.println(book.getTitle() + ", " + book.getAuthor());
    }

    for (Book book : library.searchByTitle("Learn Java")) {
      System.out.println(book.getTitle() + ", " + book.getAuthor());
    }

    Book removedBook = librarian.removeBookByTitle("Learn Java");
    if (removedBook != null) {
      System.out.println(removedBook.getTitle() + ", " + removedBook.getAuthor());
    }

    for (Book book : library.searchByTitle("Java")) {
      System.out.println(book.getTitle() + ", " + book.getAuthor());
    }
  }
}
