package poly.ex.pay1;

/**
 * 이 문제에 정답은 없습니다.<p>
 * 새로운 결제 수단을 추가했을 때 `Pay` 를 사용하는 클라이언트 코드인 `PayService` 의 변경을 최소화 할 수 있다면, <p>
 * 성공입니다.
 */
public class PayMain1 {

  public static void main(String[] args) {
    PayService payService = new PayService();

    // kakao 결제
    String payOption1 = "kakao";
    int amount1 = 5000;
    payService.processPay(payOption1, amount1);

    // naver 결제
    String payOption2 = "naver";
    int amount2 = 10000;
    payService.processPay(payOption2, amount2);

    // newPay
    String payOption3 = "new";
    int amount3 = 10000;
    payService.processPay(payOption3, amount3);

    // 잘못된 결제 수단 선택
    String payOption4 = "bad";
    int amount4 = 15000;
    payService.processPay(payOption4, amount4);
  }

}
