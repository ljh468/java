package cond.ex;

/**
 * 문제: "학점 계산하기"<p>
 * 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.<p>
 * - 90점 이상: "A"<p>
 * - 80점 이상 90점 미만: "B"<p>
 * - 70점 이상 80점 미만: "C"<p>
 * - 60점 이상 70점 미만: "D"<p>
 * - 60점 미만: "F"<p>
 * <p>
 * 점수는변수(`int score`)로 지정하고,해당 변수를 기반으로 학점을 출력하자.
 */
public class ScoreEx {

  public static void main(String[] args) {
    int score = 90;

    if (score >= 90) {
      System.out.println("학점은 A입니다.");
    } else if (score >= 80) {
      System.out.println("학점은 B입니다.");
    } else if (score >= 70) {
      System.out.println("학점은 C입니다.");
    } else if (score >= 60) {
      System.out.println("학점은 D입니다.");
    } else {
      System.out.println("학점은 F입니다.");
    }
  }
}
