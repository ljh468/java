package final1;

public class ConstantMain2 {

  // 상수 만드는 단축키 : option + command + C
  public static void main(String[] args) {

    // 상수를 사용하면 해당 값을 이해하기 쉽게 만들고, 변경에 용이하다.
    System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
    int currentUserCount = 999;
    process(currentUserCount++);
    process(currentUserCount++);
    process(currentUserCount++);
  }

  private static void process(int currentUserCount) {
    System.out.println("참여자 수:" + currentUserCount);
    if (currentUserCount > Constant.MAX_USERS) {
      System.out.println("대기자로 등록합니다.");
    } else {
      System.out.println("게임에 참여합니다.");
    }
  }
}
