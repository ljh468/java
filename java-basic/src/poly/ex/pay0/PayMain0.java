package poly.ex.pay0;

/**
 * 문제2: 결제 시스템 개발<p>
 * 여러분은 기대하던 결제 시스템 개발팀에 입사하게 되었다.<p>
 * 이 팀은 현재 2가지 결제 수단을 지원한다.앞으로 5개의 결제 수단을 추가로 지원할 예정이다.<p>
 * 새로운 결제수단을 쉽게 추가할 수 있도록, 기존 코드를 리펙토링해라.<p>
 * <br>
 * **요구사항**<p>
 * OCP 원칙을 지키세요.<p>
 * 메서드를 포함한 모든 코드를 변경해도 됩니다. 클래스나 인터페이스를 추가해도 됩니다.<p>
 * 단 프로그램을 실행하는 `PayMain0` 코드는 변경하지 않고, 그대로 유지해야 합니다.<p>
 * 리펙토링 후에도 실행 결과는 기존과 같아야 합니다.
 */
public class PayMain0 {

  public static void main(String[] args) {
    PayService payService = new PayService();

    // kakao 결제
    String payOption1 = "kakao";
    int amount1 = 5000;
    payService.processPay(payOption1, amount1);
    System.out.println();

    // naver 결제
    String payOption2 = "naver";
    int amount2 = 10000;
    payService.processPay(payOption2, amount2);
    System.out.println();

    // 잘못된 결제 수단 선택
    String payOption3 = "bad";
    int amount3 = 15000;
    payService.processPay(payOption3, amount3);

  }

}
