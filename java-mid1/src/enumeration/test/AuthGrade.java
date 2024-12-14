package enumeration.test;

/**
 * 문제1 - 인증 등급 만들기 <p>
 * **문제 설명**<p>
 * 패키지의 위치는 `enumeration.test` 를 사용하자.<p>
 * 회원의 인증 등급을 `AuthGrade` 라는 이름의 열거형으로 만들어라.<p>
 * 인증 등급은 다음 3가지이고, 인증 등급에 따른 레벨과 설명을 가진다.<p>
 * 레벨과 설명을 `getXxx()` 메서드로 조회할 수 있어야 한다.<p>
 * ```<p>
 * GUEST(손님)<p>
 * - level=1<p>
 * - description=손님<p>
 * LOGIN(로그인 회원)<p>
 * - level=2<p>
 * - description=로그인<p>
 * 회원 ADMIN(관리자)<p>
 * - level=3<p>
 * - description=관리자<p>
 * ```<p>
 */
public enum AuthGrade {

  GUEST(1, "손님"),
  LOGIN(2, "로그인 회원"),
  ADMIN(3, "관리자");

  private final int level;

  private final String description;

  AuthGrade(int level, String description) {
    this.level = level;
    this.description = description;
  }

  public int getLevel() {
    return level;
  }

  public String getDescription() {
    return description;
  }
}
