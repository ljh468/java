package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 년월일에서 시분초를 꺼내면? 시분초가 없기때문에 예외가 발생
    // UnsupportedTemporalTypeException : Unsupported field: SecondOfMinute
    System.out.println("minute = " + minute);
  }
}
