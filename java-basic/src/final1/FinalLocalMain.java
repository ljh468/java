package final1;

public class FinalLocalMain {

  public static void main(String[] args) {
    // final 지역변수1
    final int data1;
    data1 = 10;
    // data1 = 20; // 컴파일오류(최초 한번만 할당 가능)

    // final 지역변수2
    final int data2 = 10; // 선언과 초기화를 한번에 수행
    // data1 = 20; // 컴파일오류(최초 한번만 할당 가능)

    method(10);
  }

  static void method(final int parameter) {
    // paramter = 20; // 컴파일 오류(final로 선언된 매개변수는 변경할 수 없음)
  }
}
