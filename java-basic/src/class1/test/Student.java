package class1.test;

public class Student {
  private String name;
  private int age;
  private String grade;

  // 각 속성을 초기화하는 생성자
  public Student(String name, int age, String grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  // 각 속성을 반환하는 getter
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getGrade() {
    return this.grade;
  }

  public static void main(String[] args) {
    Student[] 정년이 = new Student[5];

    Student student1 = new Student("윤정년", 19, "B+");
    정년이[0] = student1;

    Student student2 = new Student("허영서", 19, "A");
    정년이[1] = student2;

    Student student3 = new Student("서혜랑", 34, "S");
    정년이[2] = student3;

    Student student4 = new Student("문옥경", 34, "S+");
    정년이[3] = student4;

    Student student5 = new Student("강소복", 43, "S");
    정년이[4] = student5;

    System.out.println("### 정년이 단원 정보 ###");
    for (Student student : 정년이) {
      System.out.println("이름: " + student.getName() + ", 나이: " + student.getAge() + ", 등급: " + student.getGrade());
    }

  }

}
