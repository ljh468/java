package cond.ex;

/**
 * 문제: "학점에 따른 성취도 출력하기"<p>
 * `String grade` 라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자. 각 학점은 다음과 같은 성취도를 나타낸다.<p>
 * - "A": "탁월한 성과입니다!"<p>
 * - "B": "좋은 성과입니다!"<p>
 * - "C": "준수한 성과입니다!"<p>
 * - "D": "향상이 필요합니다."<p>
 * - "F": "불합격입니다."<p>
 * - 나머지: "잘못된 학점입니다."<p>
 * <p>
 * `switch` 문을 사용해서 문제를 해결하자.
 */
public class GradeSwitchEx {

  public static void main(String[] args) {
    String grade = "B";

    switch (grade) {
      case "A" -> System.out.println("탁월한 성과입니다!");
      case "B" -> System.out.println("좋은 성과입니다!");
      case "C" -> System.out.println("준수한 성과입니다!");
      case "D" -> System.out.println("향상이 성과입니다!");
      case "F" -> System.out.println("불합격입니다!");
      default -> System.out.println("잘못된 학점입니다.");
    }
  }
}
