package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

// 계산하거나 조작한다면? ChronoUnit
public class ChronoUnitMain {

  public static void main(String[] args) {
    ChronoUnit[] values = ChronoUnit.values();
    for (ChronoUnit value : values) {
      System.out.println("value = " + value);
    }
    // ChronoUnit ENUM
    System.out.println("HOURS = " + ChronoUnit.HOURS); // 1시간
    System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds()); // 3600초
    System.out.println("DAYS = " + ChronoUnit.DAYS); // 1일
    System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds()); // 86400초

    // 차이 구하기
    LocalTime lt1 = LocalTime.of(1, 10, 0);
    LocalTime lt2 = LocalTime.of(1, 20, 0);

    long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2); // 600초
    System.out.println("secondsBetween = " + secondsBetween + "초");

    long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);// 10분
    System.out.println("minutesBetween = " + minutesBetween + "분");
  }
}
