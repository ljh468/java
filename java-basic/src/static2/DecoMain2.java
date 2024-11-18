package static2;

public class DecoMain2 {

  public static void main(String[] args) {
    String s = "hello java";
    String deco = DecoUtil2.deco(s); //Util클래스를 생성하지않아도 사용할 수 있음

    System.out.println("before: " + s);
    System.out.println("after: " + deco);
  }
}
