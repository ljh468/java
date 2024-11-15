package pack;

import pack.a.User; // pack.a.User import

public class PackageMain3 {

  public static void main(String[] args) {
    User userA = new User(); // 자주 사용하는 클래스는 import
    pack.b.User userB = new pack.b.User(); // 중복 클래스 이름인 경우, import 하지 않은 클래스는 패키지 경로를 모두 적어야한다.
  }
}
