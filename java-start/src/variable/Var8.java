package variable;

// 변수 타입2 : 다양한 숫자 타입
public class Var8 {

  public static void main(String[] args) {
    // 범위를 넘어가면 컴파일 에러가 발생함
    // java: integer number too large

    // 정수
    byte b = 127; // -128 ~ 127 (1바이트)
    short s = 32767; // -32,768 ~ 32,767 (2바이트)
    int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (4바이트, 약 21억)

    // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8바이트)
    long l = 9223372036854775807L; // (뒤에 L 추가)

    // 실수
    float f = 10.0f; // (4바이트, 뒤에 f추가)
    double d = 10.0; // (8바이트, 더 큰 범위)

    // 기타
    boolean a = true; // (1바이트)
    char c = 'c'; // (1바이트)
    String e = "Java"; // (문자길이에 따라 메모리 사용량이 동적으로 달라짐)

    /*
     * 자주 사용하는 타입
     * - 실무에서 자주 사용하는 타입은 다음과 같다.
     * - 정수 - `int` , `long` :자바는정수에기본으로 `int` 를사용한다.만약20억이넘을것같으면 `long` 을쓰면된 다.
     * - 파일을 다룰 때는 `byte` 를 사용한다.
     * - 실수 - `double` : 실수는 고민하지 말고 `double` 을 쓰면 된다.
     * - 불린형 - `boolean` : `true` , `false` 참 거짓을 표현한다. 이후 조건문에서 자주 사용된다.
     * - 문자열 - `String` : 문자를 다룰 때는 문자 하나든 문자열이든 모두 `String` 을 사용하는 것이 편리하다.
     */

  }
}