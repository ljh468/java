package scanner.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ## 고급(간단한 텍스트 기반 도서 관리 시스템)
 * <p>
 * 사용자가 도서를 등록, 조회, 삭제할 수 있는 간단한 도서 관리 프로그램을 작성하세요.
 * <p>
 * - **사용자 메뉴:** "도서 등록", "도서 조회", "도서 삭제", "종료" 메뉴를 제공하고, 사용자가 원하는 기능을 선택할 수 있게 합니다.<p>
 * - **도서 등록:** 책 제목과 저자를 입력받아 도서를 목록에 추가합니다.<p>
 * - **도서 조회:** 현재 등록된 모든 도서를 목록으로 보여줍니다.<p>
 * - **도서 삭제:** 삭제할 도서의 제목을 입력받아 해당 도서를 목록에서 삭제합니다.<p>
 * - **데이터 구조:** 도서 정보를 저장할 수 있는 ArrayList 등을 활용합니다.<p>
 * - **종료 기능:** "종료" 메뉴를 선택하면 프로그램이 종료됩니다.<p>
 */
public class 간단한_텍스트_기반_도서관리_시스템 {

  static List<Book> books = new ArrayList<>();

  // 도서 등록
  public static void add(String name, String author) {
    for (Book book : books) {
      if (book.getName().equals(name)) {
        System.out.println("이미 등록된 도서입니다.");
        return;
      }
    }
    Book newBook = new Book(name, author);
    books.add(newBook);
    System.out.println("새로운 도서 등록을 완료했습니다.");
  }

  // 도서 조회
  public static void search(String name) {
    for (Book book : books) {
      if (book.getName().equals(name)) {
        System.out.println("조회가 완료되었습니다.");
        System.out.println(book);
        return;
      }
    }
    System.out.println("해당 제목의 도서가 존재하지 않습니다.");
  }

  // 도서 삭제
  public static void remove(String name) {
    for (Book book : books) {
      if (book.getName().equals(name)) {
        books.remove(book);
        System.out.print(book + " : 제거를 완료했습니다.");
        return;
      }
    }
    System.out.println("해당 제목의 도서가 존재하지 않습니다.");
  }

  // 도서 전체조회(출력)
  public static void printAll() {
    for (Book book : books) {
      System.out.println(book);
    }
    System.out.println("등록된 모든 도서가 조회되었습니다.");
  }

  public static void main(String[] args) {
    int option = -1;
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      while (true) {
        try {
          System.out.println("새로운 메뉴를 입력하세요: 도서등록: 1 | 도서 조회: 2 | 도서삭제: 3 | 도서 전체 출력:4 | 종료: 5");
          option = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
          System.out.println("숫자를 입력해주세요.");
          continue;
        }

        switch (option) {
          case 1 -> {
            System.out.println("도서의 제목을 입력하세요.");
            String bookName = bufferedReader.readLine();
            System.out.println("도서의 저자를 입력하세요.");
            String bookAuthor = bufferedReader.readLine();
            System.out.println("잠시만 기다려주세요... 🌱");
            add(bookName, bookAuthor);
          }
          case 2 -> {
            System.out.println("도서의 제목을 입력하세요.");
            String bookName = bufferedReader.readLine();
            System.out.println("잠시만 기다려주세요... 🌱");
            search(bookName);
          }
          case 3 -> {
            System.out.println("도서의 제목을 입력하세요.");
            String bookName = bufferedReader.readLine();
            System.out.println("잠시만 기다려주세요... 🌱");
            remove(bookName);
          }
          case 4 -> {
            System.out.println("잠시만 기다려주세요... 🌱");
            printAll();
          }
          case 5 -> {
            System.out.println("프로그램을 종료합니다. 다음에 다시 이용해주세요. 🥹");
            return;
          }
          default -> System.out.println("올바르지 않은 메뉴입니다. 다시 입력해주세요.");
        }
        System.out.println();
      }
    } catch (IOException ignore) {
    }

  }

}

class Book {

  private String name;

  private String author;

  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return "Book [" +
        "책이름: '" + name + '\'' +
        ", 저자: '" + author + '\'' +
        "]";
  }
}