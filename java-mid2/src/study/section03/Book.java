package study.section03;

public class Book extends Item {

  private final String author;

  public Book(String name, int price, String author) {
    super(name, price);
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name=" + super.getName() +
        ", price=" + super.getPrice() +
        ", author=" + author +
        '}';
  }
}
