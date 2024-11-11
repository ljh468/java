package class1;

public class ClassStart2 {

  public static void main(String[] args) {

    // 학생데이터가 3개의 배열에 나누어져 있다. 따라서 데이터를 변경할 때 매우 조심해서 작업해야하는 문제가 있다.
    // 사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것이 좋다.
    String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
    int[] studentAges = {15, 16, 17, 20};
    int[] studentGrade = {90, 80, 70, 60};

    for (int i = 0; i < studentNames.length; i++) {
      System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
    }
  }
}
