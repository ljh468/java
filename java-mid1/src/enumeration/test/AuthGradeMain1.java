package enumeration.test;

/**
 * 문제2 - 인증 등급 열거형 조회하기<p>
 * 문제 설명**<p>
 * `AuthGradeMain1` 이라는 클래스를 만들고 다음 결과가 출력되도록 코드를 작성해라.<p>
 * 앞서 만든 `AuthGrade` 을 활용하자<p>
 * <p>
 * ```<p>
 * grade=GUEST, level=1, 설명=손님<p>
 * grade=LOGIN, level=2, 설명=로그인 회원<p>
 * grade=ADMIN, level=3, 설명=관리자<p>
 * ```
 */
public class AuthGradeMain1 {

  public static void main(String[] args) {
    AuthGrade[] values = AuthGrade.values();
    for (AuthGrade value : values) {
      System.out.println("grade: " + value.name()
                             + ", level: " + value.getLevel()
                             + ", description: " + value.getDescription());
    }
  }
}
