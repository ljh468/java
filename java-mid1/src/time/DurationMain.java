package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

  public static void main(String[] args) {
    Duration duration = Duration.ofMinutes(30);
    System.out.println("duration = " + duration);

    LocalTime localTime = LocalTime.of(1, 0);
    System.out.println("localTime = " + localTime);

    // 계산에 사용
    LocalTime plusTime = localTime.plus(duration);
    System.out.println("더한 시간: " + plusTime);

    // 시간 차이 (`Duration.between(start, end)` 와 같이 특정 시간의 차이를 구하면 `Duration` 이 반환된다.)
    LocalTime start = LocalTime.of(9, 0);
    LocalTime end = LocalTime.of(10, 0);
    Duration between = Duration.between(start, end);
    System.out.println("차이: " + between.getSeconds() + "초");

    // .xxPart()는 상위 시간을 빼고 남은 시간을 반환
    System.out.println("근무 시간: " + between.toHours() + "시간" + between.toMinutesPart() + "분");

  }
}
