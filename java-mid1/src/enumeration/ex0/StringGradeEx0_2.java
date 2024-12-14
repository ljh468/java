package enumeration.ex0;

public class StringGradeEx0_2 {

  public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();

    // 존재하지 않는 등급을 입력하면?
    int vip = discountService.discount("VIP", price);
    System.out.println("VIP 등급의 할인 금액: " + vip);

    // 오타가 발생한다면?
    int diamondd = discountService.discount("DIAMONDD", price);
    System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

    // 소문자를 입력한다면?
    int gold = discountService.discount("gold", price);
    System.out.println("gold 등급의 할인 금액: " + gold);
  }
}
