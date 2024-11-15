package construct.ex;

/**
 * 문제 - Book과 생성자<p>
 * `BookMain` 코드가 작동하도록 `Book` 클래스를 완성하세요. 특히 `Book` 클래스의 생성자 코드에 중복이 없도록 주의하세요.<p>
 *  생성자는 기본 생성자부터 모든 필드를 매개변수로 받는 생성자까지 모두 만드세요.<p>
 */
public class Book {

  String title;

  String author;

  int page;

  // TODO: 코드를 완성하세요.
  // 기본 생성자
  public Book() {}

  // title, author만을 매개변수로 받는 생성자
  public Book(String title, String author) {
    this(title, author, 300);
  }

  // 모든 필드를 매개변수로 받는 생성자
  public Book (String title, String author, int page) {
    this.title = title;
    this.author = author;
    this.page = page;
  }

  public void displayInfo() {
    System.out.println("제목 : " + title + ", 저자: " + author + ", 페이지: " + page);
  }

}
