package generic.ex1;

public class RawTypeMain {

  // 로타입은 제네릭이 없는 자바 버전의 하위 호환성때문에 존재함 (사용하지 않아야 함)
  public static void main(String[] args) {
    GenericBox integerBox = new GenericBox();
    // GenericBox<Object> integerBox = new GenericBox<>(); // 권장
    integerBox.set(10);
    Integer result = (Integer) integerBox.get();
    System.out.println("result = " + result);
  }
}