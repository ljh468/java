package variable;

// 변수 타입1
public class Var7 {

  public static void main(String[] args) {
    int a = 100; // 정수
    double b = 10.5; // 실수
    boolean c = true; // 참, 거짓(boolean) true, false 입력 가능
    char d = 'A'; // 문자 하나
    String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 참조 타입

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    System.out.println("e = " + e);

    // 각 변수는 지정한 타입에 맞는 값을 사용해야 한다. 예를 들어서 다음의 앞의 두 코드는 컴파일 오류가 발생
    // int z = "asdf"; 안됨

    // 리터럴 : 직접 적는 값을 의미 ex) 10.5, true, "Java"
  }
}
