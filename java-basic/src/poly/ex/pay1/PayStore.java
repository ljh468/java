package poly.ex.pay1;

// 결제 수단을 관리하는 클래스
public abstract class PayStore {

  // 변하는 부분
  public static Pay findPay(String option) {
    return switch (option) {
      case "kakao" -> new KakaoPay();
      case "naver" -> new NaverPay();
      case "new" -> new NewPay();
      default -> new DefaultPay();
    };
  }
}
