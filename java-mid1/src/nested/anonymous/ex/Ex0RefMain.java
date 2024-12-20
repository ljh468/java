package nested.anonymous.ex;

// 변하는 부분과 변하지 않는 부분을 분리해야 한다.
public class Ex0RefMain {

  public static void hello(String str) {
    System.out.println("프로그램 시작"); // 변하지 않는 부분
    System.out.println(str); // str: 변하는 부분
    System.out.println("프로그램 종료"); // 변하지 않는 부분
  }

  public static void main(String[] args) {
    hello("Hello Java");
    hello("Hello Spring");
  }

}
