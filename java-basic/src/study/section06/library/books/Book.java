package study.section06.library.books;

public class Book {

  private String title;

  private String author;

  private String isbn;

  private boolean isCheckedOut;

  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getIsbn() {
    return isbn;
  }

  public boolean isCheckedOut() {
    return isCheckedOut;
  }

  public void checkout() {
    this.isCheckedOut = true;
  }

  public void returnBook() {
    this.isCheckedOut = false;
  }

  public void print() {
    System.out.println("도서{제목= " + title + ", 저자= " + author + ", 도서고유번호: " + isbn + "}");
  }
}