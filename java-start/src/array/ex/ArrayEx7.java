package array.ex;

import java.util.Scanner;

/**
 * 문제 - 2차원 배열1 <p>
 * 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.<p>
 * 2차원 배열을 사용하고, 실행 결과 예시를 참고하자.<p>
 * <p>
 * ex:<p>
 * 1번 학생의 성적을 입력하세요:<p>
 * 국어 점수: 100<p>
 * 영어 점수: 80<p>
 * 수학 점수: 70<p>
 * 2번 학생의 성적을 입력하세요:<p>
 * 국어 점수: 30<p>
 * 영어 점수: 40<p>
 * 수학 점수: 50<p>
 * 3번 학생의 성적을 입력하세요:<p>
 * 국어 점수: 60<p>
 * 영어 점수: 70<p>
 * 수학 점수: 50<p>
 * 4번 학생의 성적을 입력하세요:<p>
 * 국어 점수: 90<p>
 * 영어 점수: 100<p>
 * 수학 점수: 80<p>
 * 1번 학생의 총점: 250, 평균: 83.33333333333333<p>
 * 2번 학생의 총점: 120, 평균: 40.0<p>
 * 3번 학생의 총점: 180, 평균: 60.0<p>
 * 4번 학생의 총점: 270, 평균: 90.0<p>
 */
public class ArrayEx7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] scores = new int[4][3];
    String[] subjects = {"국어", "영어", "수학"};

    for (int i = 0; i < 4; i++) {
      System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
      for (int j = 0; j < 3; j++) {
        System.out.print(subjects[j] + " 점수: ");
        scores[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < 4; i++) {
      int total = 0;
      // i번 학생의 총점 계산
      for (int j = 0; j < 3; j++) {
        total += scores[i][j];
      }
      // // i번 학생의 평균 계산
      double average = total / 3.0;
      System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
    }

  }
}
