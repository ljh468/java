package generic.ex5;

// 타입 Eraser로 인해 사용할 수 없는 경우
public class EraserBox<T> {

  public boolean instanceCheck(Object param) {
    // return param instanceof T; // 오류
    // return param instanceof Object; // 런타임시에 이렇게 변함 (항상 참)
    return false;
  }

  public T create() {
    // return new T(); // 오류
    // return new Object(); // 런타임시에 이렇게 변함 (의도와 다름)
    return null;
  }
}
