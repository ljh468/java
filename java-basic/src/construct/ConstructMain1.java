package construct;

public class ConstructMain1 {

  public static void main(String[] args) {
    // 객체를 생성할 때 직접 정의한 생성자가 있다면 반드시 생성자를 호출해야한다.
    // 생성자를 호출하지 않으면 컴파일 에러가 발생: no suitable constructor found for
    // MemberConstruct member = new MemberConstruct();
    MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
    MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

    MemberConstruct[] members = {member1, member2};

    for (MemberConstruct s : members) {
      System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
    }
  }
}
