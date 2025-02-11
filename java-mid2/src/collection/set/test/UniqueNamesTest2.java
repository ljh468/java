package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 문제2 - 중복 제거와 입력 순서 유지<p>
 * **문제 설명**<p>
 * 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.<p>
 * 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.<p>
 * 단, 입력 순서대로 출력해라.<p>
 * 출력 예): 30, 20, 10
 */
public class UniqueNamesTest2 {

  public static void main(String[] args) {
    Integer[] inputArr = {30, 20, 20, 10, 10};
    // 입력 순서를 유지함
    Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

    for (Integer s : set) {
      System.out.println(s);
    }
  }
}
