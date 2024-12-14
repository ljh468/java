package enumeration.ref3;

public enum Grade {

  BASIC(10),
  GOLD(20),
  DIAMOND(30);

  private final int discountPercent;

  Grade(int discountPercent) {
    this.discountPercent = discountPercent;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }

  // 객체지향 관점에서 이렇게 자신의 데이터를 외부에 노출하는 것 보다는,
  // `Grade` 클래스가 자신의 할인율을 어떻 게 계산하는지 스스로 관리하는 것이 캡슐화 원칙에 더 맞다.
  public int discount(int price) {
    return price * discountPercent / 100;
  }
}
