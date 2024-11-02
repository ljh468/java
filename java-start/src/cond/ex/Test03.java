package cond.ex;

import java.util.Scanner;

/**
 * 문제. 학생의 점수(0~100)를 입력받아<p>
 * 90점 이상일 경우 "A",<p>
 * 80점 이상일 경우 "B",<p>
 * 70점 이상일 경우 "C",<p>
 * 나머지 경우 "F"를 출력하는 코드를 `if-else`문으로 작성하세요.
 */
public class Test03 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("학생의 점수를 입력하시오: ");
    int score = scanner.nextInt();
    if (0 <= score && score <= 100) {
      System.out.println("당신의 성적은? " + getGrade(score) + "입니다.");
    } else {
      System.out.println("올바르지 않은 점수입니다.");
    }
  }

  private static String getGrade(int score) {
    if (score >= 90) {
      return "A";
    } else if (score >= 80) {
      return "B";
    } else if (score >= 70) {
      return "C";
    } else {
      return "F";
    }
  }
}
