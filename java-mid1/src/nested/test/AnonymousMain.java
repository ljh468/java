package nested.test;

// 문제4 - 익명 클래스를 완성해라
public class AnonymousMain {

  public static void main(String[] args) {
    Hello hello = new Hello() {

      @Override
      public void hello() {
        System.out.println("Hello.hello");
      }
    };

    hello.hello();
  }
}
