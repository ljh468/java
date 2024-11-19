package final1.ex;

public class MemberMain {

  public static void main(String[] args) {
    Member member = new Member("myId", "noah");
    System.out.println("member = " + member);

    // id는 final로 선언되었기 때문에 바꿀 수 없음 (id를 받는 메서드는 잘못된 메서드)
    member.changeData("myId2", "joe");
    System.out.println("member = " + member);
  }
}
