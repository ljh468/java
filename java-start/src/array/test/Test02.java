package array.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제2. 사용자로부터 숫자 입력을 받아 그 숫자만큼의 길이를 가지는 배열을 생성한 후,<p>
 * 배열에 랜덤한 값을 채우고 배열의 평균을 출력하는 코드를 작성하세요. (Scanner와 Math.random()을 사용할 수 있음)
 */
public class Test02 {

  public static void main(String[] args) {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.print("배열의 길이를 입력하세요: ");
      int length = Integer.parseInt(bufferedReader.readLine());

      // 배열 생성
      int[] array = new int[length];
      int sum = 0;

      // 배열에 랜덤 값 채우기
      for (int i = 0; i < length; i++) {
        array[i] = (int) (Math.random() * 100) + 1; // 1 ~ 100 사이의 랜덤 값
        sum += array[i]; // 배열에 값을 넣으면서 모두 더해줌
        System.out.println("array[" + i + "] = " + array[i]);
      }

      // 배열의 평균 구하기 (sum / length)
      double average = (double) sum / length;
      System.out.println("배열의 평균 값: " + average);

    } catch (IOException ignore) {
    }
  }
}
