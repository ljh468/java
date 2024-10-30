package variable;

// 만약 변수를 초기화 하지 않고 사용하면 어떻게 될까?
public class Var6 {

  public static void main(String[] args) {
    /*
     * 컴파일 에러 발생 - java: variable a might not have been initialized
     * 새로운 메모리 공간을 할당하면 기존에 어떤값이 있었는지 모른다. (쓰레기 값)
     * Java는 이것을 예방하기 위해 변수를 초기화하도록 강제한다.
     */

    int a; // 초기화되지 않은 변수는 컴파일하면 메모리를 할당하지 않음
    // System.out.println("a = " + a);
  }
}
