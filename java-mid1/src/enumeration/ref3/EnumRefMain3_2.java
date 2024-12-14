package enumeration.ref3;

public class EnumRefMain3_2 {

  public static void main(String[] args) {
    int price = 10000;

    // DiscountService를 호출할 필요가 없다. (등급별로 할인율이 정해지기 때문)
    System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
    System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
    System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
  }
}
