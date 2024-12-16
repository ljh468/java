package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

  public static void main(String[] args) {
    ZonedDateTime nowZdt = ZonedDateTime.now();
    System.out.println("nowZdt = " + nowZdt);

    LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
    System.out.println("ldt = " + ldt);

    ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
    System.out.println("zdt1 = " + zdt1);

    ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
    System.out.println("zdt2 = " + zdt2);

    // UTC 기준 시간으로 변경
    ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC")); // -09:00
    System.out.println("utcZdt = " + utcZdt);
  }
}
