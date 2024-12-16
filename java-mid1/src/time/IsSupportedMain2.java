package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

  public static void main(String[] args) {
    LocalDate now = LocalDate.now();

    // 현재 타입에서 특정 시간 단위나 필드를 사용할 수 있는지 확인할 수 있는 메서드를 제공
    boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
    System.out.println("supported = " + supported);
    if (supported) {
      int minute = now.get(ChronoField.SECOND_OF_MINUTE);
      System.out.println("minute = " + minute);
    }
  }
}
