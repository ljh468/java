package ref;

// null에다가 .을 찍으면 NullPointerException 예외가 발생한다.
public class NullMain2 {

  public static void main(String[] args) {
    Data data = null;
    System.out.println("data = " + data);
    data.value = 10;
    // null.value ?
    // NullPointerException 예외 발생
    System.out.println("data = " + data.value);
  }
}
