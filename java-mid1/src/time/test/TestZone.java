package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 문제5 - 국제 회의 시간<p>
 * 서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구해라.<p>
 * 실행 결과를 참고하자.<p>
 * `TestZone` 클래스에 문제를 풀어라.<p>
 */
public class TestZone {

  public static void main(String[] args) {
    ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1),
                                               LocalTime.of(9, 0),
                                               ZoneId.of("Asia/Seoul"));

    // .withZoneSameInstant(ZoneId) - 해당시간의 zoneId 지역의 시간
    ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
    ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

    System.out.println("서울의 회의 시간: " + seoulTime);
    System.out.println("런던의 회의 시간: " + londonTime);
    System.out.println("뉴욕의 회의 시간: " + nyTime);
  }
}
