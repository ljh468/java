package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 문제1 - 배열을 맵으로 전환<p>
 * **문제 설명**<p>
 * 상품의 이름과 가격이 2차원 배열로 제공된다.<p>
 * 다음 예제를 참고해서 2차원 배열의 데이터를 `Map<String, Integer>` 로 변경해라.<p>
 * 그리고 실행 결과를 참고해서 `Map` 을 출력해라.<p>
 * 출력 순서는 상관없다.
 */
public class ArrayToMapTest {

  public static void main(String[] args) {
    String[][] productArr = {
        {"Java", "10000"},
        {"Spring", "20000"},
        {"JPA", "30000"}
    };

    // 주어진 배열로부터 Map 생성
    Map<String, Integer> productMap = new HashMap<>();
    for (String[] product : productArr) {
      productMap.put(product[0], Integer.valueOf(product[1]));
    }

    // Map 모든 데이터 출력 1
    for (String key : productMap.keySet()) {
      System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
    }
    System.out.println();

    // Map 모든 데이터 출력 2
    Set<Map.Entry<String, Integer>> entries = productMap.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
    }
  }
}