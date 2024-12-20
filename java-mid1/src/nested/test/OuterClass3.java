package nested.test;

// 문제3 - 지역 클래스를 완성해라
public class OuterClass3 {

  public void myMethod() {

    class LocalClass {
      public void hello() {
        System.out.println("LocalClass.hello");
      }
    }

    LocalClass local = new LocalClass();
    local.hello();
  }
}
