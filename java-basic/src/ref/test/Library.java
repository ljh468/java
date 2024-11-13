package ref.test;

public class Library {

  private Book[] books;

  private int bookCount;

  public Library() {
    this.books = new Book[10];
    this.bookCount = 0;
  }

  private void expandArray() {
    Book[] newBooks = new Book[books.length * 2];
    System.arraycopy(books, 0, newBooks, 0, books.length);
    this.books = newBooks;
  }

  public void addBook(Book newBook) {
    if (bookCount == books.length) {
      expandArray();
    }
    books[bookCount] = newBook;
    bookCount++;
  }

  public Book searchByTitle(String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return book;
      }
    }
    return null;
  }

  public void printBooks() {
    for (int i = 0; i < bookCount; i++) {
      System.out.println(String.format("제목 = %s, 가격 = %d",
                                       books[i].getTitle(),
                                       books[i].getPrice()));
    }
  }
}
