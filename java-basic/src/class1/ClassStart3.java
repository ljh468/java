package class1;

// 클래스 도입
// 클래스를 사용해서 학생이라는 개념을 만들고, 각각의 학생 별로 본인의 이름, 나이, 성적을 관리하는 것
public class ClassStart3 {

  public static void main(String[] args) {
    Student student1; // Student 클래스
    student1 = new Student(); // 메모리 할당, 메모리공간에 올라가면 객체 or 인스턴스라고 함, x001
    student1.name = "학생1";
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student(); // 접근할 수 있는 메모리 참조값 주소 : x002
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

    System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
    System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
  }
}
