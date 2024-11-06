package array.ex;

import java.util.Scanner;

/**
 * 문제 - 2차원 배열2<p>
 * 이전 문제에서 학생수를 입력받도록 개선하자. 실행 결과 예시를 참고하자.<p>
 * <p>
 * ex:<p>
 * 학생수를 입력하세요: 3<p>
 * 1번 학생의 성적을 입력하세요:<p>
 * 국어 점수: 10<p>
 * 영어 점수: 20<p>
 * 수학 점수: 30<p>
 * 2번 학생의 성적을 입력하세요:<p>
 * 국어 점수:10<p>
 * 영어 점수: 10<p>
 * 수학 점수: 10<p>
 * 3번 학생의 성적을 입력하세요:<p>
 * 국어 점수: 20<p>
 * 영어 점수: 20<p>
 * 수학 점수: 20<p>
 * 1번 학생의 총점: 60, 평균: 20.0<p>
 * 2번 학생의 총점: 30, 평균: 10.0<p>
 * 3번 학생의 총점: 60, 평균: 20.0<p>
 */
public class ArrayEx8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("학생수를 입력하세요: ");
    int studentCount = scanner.nextInt();

    int[][] scores = new int[studentCount][3];
    String[] subjects = {"국어", "영어", "수학"};

    for (int i = 0; i < studentCount; i++) {
      System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
      for (int j = 0; j < 3; j++) {
        System.out.print(subjects[j] + " 점수: ");
        scores[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < studentCount; i++) {
      int total = 0;
      for (int j = 0; j < 3; j++) {
        total += scores[i][j];
      }
      double average = total / 3.0;
      System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
    }

  }
}
