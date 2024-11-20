package extends1.super2;

public class ClassB extends ClassA {

  public ClassB(int a) {
    // 자신의 다른 생성자를 호출하면 부모 생성자 없어도 됨 (다른 생성자에서 부모생성자를 호출할테니까)
    // super(...)` 는 자식의 생성자 안에서 언젠가는 반드시 호출해야 한다.
    this(a, 0);
    System.out.println("ClassB 생성자 a=" + a);
  }

  public ClassB(int a, int b) {
    super(); // 기본 생성자 생략 가능
    System.out.println("ClassB 생성자 a=" + a + " b=" + b);
  }
}
