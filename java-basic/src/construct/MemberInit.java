package construct;

public class MemberInit {

  String name;

  int age;

  int grade;

  // 초기화 메서드 추가
  void initMember(String name, int age, int grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}
