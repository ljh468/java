package ref;

// 대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다.
public class MethodChange1 {

  public static void main(String[] args) {
    int a = 10;
    System.out.println("메서드 호출 전: a = " + a);
    changePrimitive(a);
    System.out.println("메서드 호출 후: a = " + a);
  }

  static void changePrimitive(int x) {
    x = 20;
    System.out.println("메서드 안의 변수: x = " + x);
  }
}
