package cond;

public class Switch5 {

  public static void main(String[] args) {
    int grade = 3;

    int coupon = switch (grade) {
      case 1 -> 1000;
      case 2 -> 2000;
      case 3 -> {
        System.out.println("추가 로직 수행");
        yield 3000;
      }
      default -> 500;
    };
    System.out.println("발급받은 쿠폰 " + coupon);
  }
}
