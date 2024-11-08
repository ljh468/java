package method;

public class Overloading3 {

  public static void main(String[] args) {
    System.out.println("1: " + add(1, 2));
    System.out.println("2: " + add(1.2, 1.5));
  }

  // int는 double로 자동 형변환이 되므로 1번 메서드는 제거해도 2번 메서드가 호출된다.
  public static int add(int a, int b) {
    System.out.println("1번 호출");
    return a + b;
  }

  public static double add(double a, double b) {
    System.out.println("2번 호출");
    return a + b;
  }
}
