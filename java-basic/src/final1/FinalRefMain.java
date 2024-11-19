package final1;

public class FinalRefMain {

  public static void main(String[] args) {
    final Data data = new Data();
    // data = new Data(); // 참조 대상은 변경할 수 없음

    // 그러나 참조 대상의 값은 final이 아니면 변경 가능 (public int value;)
    data.value = 10;
    System.out.println(data.value);
    data.value = 20;
    System.out.println(data.value);
  }
}
