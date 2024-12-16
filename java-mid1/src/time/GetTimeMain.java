package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

  public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);

    // 2030-01-01T13:30:59
    System.out.println("YEAR = " + dt.get(ChronoField.YEAR));
    System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));
    System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));
    System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY));
    System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));
    System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE));
    System.out.println();

    // 2030-01-01T13:30:59
    System.out.println("편의 메서드 제공");
    System.out.println("getYear = " + dt.getYear());
    System.out.println("getMonthValue = " + dt.getMonthValue());
    System.out.println("getDayOfMonth = " + dt.getDayOfMonth());
    System.out.println("getHour = " + dt.getHour());
    System.out.println("getMinute = " + dt.getMinute());
    System.out.println("getSecond = " + dt.getSecond());
    System.out.println();

    System.out.println("편의 메서드에 없음");
    System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));
    System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));
  }
}
