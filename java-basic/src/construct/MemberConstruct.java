package construct;

public class MemberConstruct {

  String name;

  int age;

  int grade;

  // 생성자 오버로딩1
  MemberConstruct(String name, int age) {
    // `this()` 를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다, 그리고 생성자 첫줄에만 작성이 가능
    this(name, age, 50); // 기본 grade 값을 넣어서 인자를 3개 받는 생성자를 호출

  }

  // 생성자 오버로딩2
  MemberConstruct(String name, int age, int grade) {
    System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}
