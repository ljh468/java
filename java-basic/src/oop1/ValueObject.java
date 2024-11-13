package oop1;

// 자바 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다.
public class ValueObject {

  // 속성(데이터)
  int value = 0;

  // 기능(메서드)
  void add() {
    this.value++;
    System.out.println("숫자 증가 = " + value);
  }
}
