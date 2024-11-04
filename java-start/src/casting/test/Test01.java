package casting.test;

/**
 * 문제1. 변수 `a`, `b`를 받아 더한 후, 자동 형변환과 명시적 형변환을 활용하여 <p>
 * 다양한 타입(`float`, `int`, `double`)으로 변환해 출력하는 메서드를 작성하세요.
 */
public class Test01 {

  // int + int의 결과를 자동으로 double로 형변환하여 반환
  public static double addAndConvertToDouble(int a, int b) {
    double result = a + b; // 자동 형변환 (int -> double)
    System.out.println("Double 타입으로 자동 변환: " + result);
    return result;
  }

  // int + int의 결과를 자동으로 float으로 형변환하여 반환
  public static float addAndConvertToFloat(int a, int b) {
    float result = a + b; // 자동 형변환 (int -> float)
    System.out.println("Float 타입으로 자동 변환: " + result);
    return result;
  }

  // int + int의 결과를 명시적 형변환으로 double로 변환하여 반환
  public static double addAndExplicitConvertToDouble(int a, int b) {
    double result = (double) (a + b); // 명시적 형변환
    System.out.println("Double 타입으로 명시적 변환: " + result);
    return result;
  }

  // int + int의 결과를 명시적 형변환으로 float으로 변환하여 반환
  public static float addAndExplicitConvertToFloat(int a, int b) {
    float result = (float) (a + b); // 명시적 형변환
    System.out.println("Float 타입으로 명시적 변환: " + result);
    return result;
  }

  // int + int의 결과를 int로 반환 (형변환이 필요 없는 경우)
  public static int addAndReturnAsInt(int a, int b) {
    int result = a + b;
    System.out.println("Int 타입 그대로 반환: " + result);
    return result;
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    addAndConvertToDouble(a, b);
    addAndConvertToFloat(a, b);
    addAndExplicitConvertToDouble(a, b);
    addAndExplicitConvertToFloat(a, b);
    addAndReturnAsInt(a, b);
  }
}