package extends1.super2;

public class ClassC extends ClassB {

  public ClassC() {
    super(10); // ClassB의 기본생성자가 없으므로 정의해야함 (생성자는 1개만 선택하여 호출할 수 있음)
    System.out.println("ClassC 생성자");
  }
}
