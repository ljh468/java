package enumeration.ref2;

public enum Grade {
  // Grade에서 discountPercent 값을 관리
  BASIC(10), // 생성자를 호출
  GOLD(20),
  DIAMOND(30);

  private final int discountPercent;

  Grade(int discountPercent) {
    this.discountPercent = discountPercent;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }

}
