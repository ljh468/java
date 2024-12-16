package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

  public static void main(String[] args) {
    // Period 생성
    Period period = Period.ofDays(10); // 일
    System.out.println("period = " + period); // P10D

    Period period2 = Period.ofMonths(3); // 월
    System.out.println("period2 = " + period2); // P3M

    Period period3 = Period.ofYears(2024); // 년
    System.out.println("period3 = " + period3); // P2024Y

    // 계산에 사용할 수 있음
    LocalDate currentDate = LocalDate.of(2030, 1, 1);
    LocalDate plusDate = currentDate.plus(period); // +10일
    System.out.println("currentDate = " + currentDate);
    System.out.println("plusDate = " + plusDate);

    // 기간 차이를 구할 수 있음
    LocalDate startDate = LocalDate.of(2023, 1, 1);
    LocalDate endDate = LocalDate.of(2023, 4, 2);
    Period between = Period.between(startDate, endDate);
    System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");
  }
}
