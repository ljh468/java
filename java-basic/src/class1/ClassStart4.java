package class1;

public class ClassStart4 {

  public static void main(String[] args) {
    Student student1 = new Student(); // x001
    student1.name = "학생1";
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student(); // x002
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

    // Student 객체를 배열로 선언해서 관리
    // 배열을 사용하면 특정 타입을 연속된 데이터 구조로 묶어서 편리하게 관리할 수 있다.

    Student[] students = new Student[2]; // [null, null]\
    students[0] = student1; // [x001] , 자바에서 대입은 항상 변수에 들어있는 값을 복사한다.
    students[1] = student2; // [x001, x002]

    System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
    System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
  }
}
