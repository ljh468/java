package collection.map.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제3 - 같은 단어가 나타난 수<p>
 * **문제 설명**<p>
 * 각각의 단어가 나타난 수를 출력해라.<p>
 * 실행 결과를 참고하자.
 */
public class WordFrequencyTest1 {

  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";
    Map<String, Integer> map = new HashMap<>();
    String[] words = text.split(" ");
    for (String word : words) {
      Integer count = map.get(word);
      if (count == null) {
        count = 0;
      }
      count++;

      map.put(word, count);
    }

    System.out.println(map);
  }
}