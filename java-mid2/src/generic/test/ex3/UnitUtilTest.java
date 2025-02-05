package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;

/**
 * 문제와 풀이1 - 제네릭 메서드와 상한<p>
 * **문제 설명**<p>
 * 다음 코드와 실행 결과를 참고해서 `UnitUtil` 클래스를 만들어라.<p>
 * `UnitUtil.maxHp()` 메서드의 조건은 다음과 같다.<p>
 * 두 유닛을 입력 받아서 체력이 높은 유닛을 반환한다.<p>
 * 체력이 같은 경우 둘 중 아무나 반환해도 된다. 제네릭 메서드를 사용해야 한다.<p>
 * 입력하는 유닛의 타입과 반환하는 유닛의 타입이 같아야 한다.
 */
public class UnitUtilTest {

  public static void main(String[] args) {
    Marine m1 = new Marine("마린1", 40);
    Marine m2 = new Marine("마린2", 50);
    Marine resultMarine = UnitUtil.maxHp(m1, m2);
    System.out.println("resultMarine = " + resultMarine);

    Zealot z1 = new Zealot("질럿1", 100);
    Zealot z2 = new Zealot("질럿2", 150);
    Zealot resultZealot = UnitUtil.maxHp(z1, z2);
    System.out.println("resultZealot = " + resultZealot);
  }
}
