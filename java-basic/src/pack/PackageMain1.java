package pack;

public class PackageMain1 {

  public static void main(String[] args) {
    Data data = new Data();
    pack.a.User user = new pack.a.User(); // 다른 패키지의 클래스를 사용하면 위치를 모두 적어줘야한다.
  }
}
