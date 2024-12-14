package enumeration.ex3;

public class EnumRefMain {

  public static void main(String[] args) {
    System.out.println("class BASIC = " + Grade.BASIC.getClass());
    System.out.println("class GOLD = " + Grade.GOLD.getClass());
    System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

    // 참조값이 모두 다른 것을 볼 수 있음
    System.out.println("ref BASIC = " + refValue(Grade.BASIC));
    System.out.println("ref GOLD = " + refValue(Grade.GOLD));
    System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
  }

  private static String refValue(Object grade) {
    return Integer.toHexString(System.identityHashCode(grade));
  }
}
