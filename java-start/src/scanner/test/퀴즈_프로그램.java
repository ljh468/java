package scanner.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ## 중급(퀴즈 프로그램)<p>
 * <p>
 * 퀴즈 문제를 사용자에게 제시하고, 정답을 입력받아 점수를 계산하는 프로그램을 만드세요.<p>
 * <p>
 * - ** 문제 구성: ** 5개의 퀴즈 문제와 정답을 미리 설정합니다.<p>
 * - ** 프로그램 동작: ** 문제를 하나씩 사용자에게 제시하고 답을 입력받습니다. 각 정답에 맞으면 점수를 부여합니다.<p>
 * - ** 결과 출력: ** 모든 문제를 푼 후 최종 점수를 출력하고, 몇 개를 맞췄는지 표시합니다.<p>
 * - ** 확장 가능성: ** 문제와 답을 배열이나 리스트로 저장해 확장 가능하도록 구성합니다.<p>
 */
public class 퀴즈_프로그램 {

  public static void main(String[] args) {

    String[] quizzes = {
        "세상에서 제일 귀여운 강아지 종류는? (힌트: oo이누)",
        "썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어의 이름은? (한글로)",
        "자바의 창시자는? (한글로)",
        "머신러닝의 한 분야로, 사람의 뇌에서 구현되는 지능을 구현한 ‘인공신경망’을 이용하는 보다 특화된 학습방법을 의미하는 용어는? (힌트: 깊은학습)",
        "미국의 증권거래소에 상장된 500개의 가장 큰 기업들의 주가 성과를 추적하는 주가 지수는?"
    };

    String[] answers = {
        "시바",
        "자바",
        "제임스고슬링",
        "딥러닝",
        "S&P500"
    };

    int totalScore = 0;

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      for (int i = 0; i < quizzes.length; i++) {
        System.out.println((i + 1) + "번째 문제입니다.");
        System.out.println(quizzes[i]);
        String input = bufferedReader.readLine();
        // 정답
        if (input.trim().replace(" ", "").equalsIgnoreCase(answers[i])) {
          totalScore += 20;
          System.out.println("축하합니다. 정답입니다. 🌱");
        }
        // 오답
        else {
          System.out.println("아쉽네요. 신중히 정답을 생각해주세요. 🥲");
        }
      }

      System.out.println("문제를 모두 푸셨습니다. 당신의 점수는? " + totalScore + "입니다.");
    } catch (IOException ignore) {
    }
  }
}
