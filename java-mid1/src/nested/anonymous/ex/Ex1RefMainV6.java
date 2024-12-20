package nested.anonymous.ex;

import java.util.Random;

// Runnable은 기본적으로 제공해주는 인터페이스 (입력값X, 반환값X)
public class Ex1RefMainV6 {

  public static void hello(Runnable runnable) {
    System.out.println("프로그램 시작");
    // 코드 조각 시작
    runnable.run();
    // 코드 조각 종료
    System.out.println("프로그램 종료");
  }

  public static void main(String[] args) {
    System.out.println("Hello 실행");
    hello(() -> {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("주시위 = " + randomValue);
    });

    hello(() -> {
      for (int i = 0; i < 3; i++) {
        System.out.println("i = " + i);
      }
    });
  }

}
