package lang.immutable.address;

public class RefMain2 {

  public static void main(String[] args) {
    ImmutableAddress a = new ImmutableAddress("서울");
    ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다.
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // b의 값을 부산으로 변경해야함
    // b.setValue("부산"); // 값을 바꿀 수 없는 불변객체구나!
    b = new ImmutableAddress("부산");
    System.out.println("부산 -> b");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
