package method.test;

/**
 * 문제. 문자열 두 개를 받아서 두 문자열이 같은지 여부를 확인하는 메서드 `isEqual(String str1, String str2)`를 작성하고,<p>
 * 메서드 오버로딩을 통해 추가적으로 대소문자를 구분하지 않고 비교하는 `isEqualIgnoreCase(String str1, String str2)` 메서드를 작성하세요.
 */
public class Test02 {

  public static void main(String[] args) {
    String str1 = "Hello Java";
    String str2 = "hello java";

    System.out.println("str1, str2이 같나요? = " + isEquals(str1, str2));
    System.out.println("str1, str2이 같나요? (대소문자 무시) = " + isEqualsIgnoreCase(str1, str2));
  }

  public static boolean isEquals(String str1, String str2) {
    return str1.equals(str2);
  }

  public static boolean isEqualsIgnoreCase(String str1, String str2) {
    return str1.equalsIgnoreCase(str2);
  }
}
