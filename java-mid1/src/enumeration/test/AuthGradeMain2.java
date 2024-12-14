package enumeration.test;

import java.util.Scanner;

/**
 * 문제3 - 인증 등급 열거형 활용하기<p>
 * **문제 설명**<p>
 * `AuthGradeMain2` 클래스에 코드를 작성하자.<p>
 * 인증 등급을 입력 받아서 앞서 만든 `AuthGrade` 열거형으로 변환하자.<p>
 * 인증 등급에 따라 접근할 수 있는 화면이 다르다.<p>
 * - 예를 들어 GUEST 등급은 메인 화면만 접근할 수 있고, ADMIN 등급은 모든 화면에 접근할 수 있다.<p>
 * - 각각의 등급에 따라서 출력되는 메뉴 목록이 달라진다.<p>
 * 다음 출력 결과를 참고해서 코드를 완성하자.<p>
 * ```<p>
 * **GUEST 입력 예**<p>
 * 당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: GUEST<p>
 * 당신의 등급은 손님입니다.<p>
 * == 메뉴 목록 ==<p>
 * - 메인 화면<p>
 * ```<p>
 * ```<p>
 * **LOGIN 입력 예**<p>
 * 당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: LOGIN<p>
 * 당신의 등급은 로그인 회원입니다.<p>
 * == 메뉴 목록 ==<p>
 * - 메인 화면<p>
 * - 이메일 관리 화면<p>
 * ```<p>
 * ```<p>
 * **ADMIN 입력 예**<p>
 * 당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ADMIN<p>
 * 당신의 등급은 관리자입니다.<p>
 * == 메뉴 목록 ==<p>
 * - 메인 화면<p>
 * - 이메일 관리 화면<p>
 * - 관리자 화면<p>
 * ```<p>
 * ```<p>
 * **잘못된 값이 입력되는 경우**<p>
 * java.lang.IllegalArgumentException<p>
 * ```<p>
 */
public class AuthGradeMain2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
    String grade = scanner.nextLine();

    // 잘못된 값 : IllegalArgumentException
    AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase()); // 대문자 허용
    System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

    System.out.println("== 메뉴 목록 ==");
    if (authGrade.getLevel() > 0) {
      System.out.println("- 메인 화면");
    }
    if (authGrade.getLevel() > 1) {
      System.out.println("- 이메일 관리 화면");
    }
    if (authGrade.getLevel() > 2) {
      System.out.println("- 관리자 화면");
    }
  }
}
