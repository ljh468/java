package lang.immutable.address;

public class RefMain1_3 {

  public static void main(String[] args) {
    Address a = new Address("서울");
    Address b = a;
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // 복잡한 코드에서는 사이드 이펙트가 발생하기 쉬움
    change(b, "부산");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  private static void change(Address address, String changeAddress) {
    System.out.println("주소 값을 변경합니다 -> " + changeAddress);
    address.setValue(changeAddress);
  }
}
