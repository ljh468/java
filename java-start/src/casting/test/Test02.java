package casting.test;

/**
 * 문제3. `long`과 `int` 타입을 사용하는 두 개의 변수 `num1`, `num2`를 더한 후 <p>
 * 결과를 `short` 타입으로 명시적 형변환하는 메서드를 작성하세요. <p>
 * 결과가 올바르게 저장되지 않는 상황에 대해서도 설명하세요.
 */
public class Test02 {

  public static void main(String[] args) {
    long longValue = 20L;
    int intValue = 3;
    short shortValue = addAndCastShort(longValue, intValue);
    System.out.println("shortValue = " + shortValue);
  }

  public static short addAndCastShort(long num1, int num2) {
    // long과 int를 더한 결과는 long 타입 (큰값으로 자동 형변환)
    long result = num1 + num2;

    // 명시적 형변환을 통해 long을 short으로 변환하여 리턴
    return (short) result;
  }
}
