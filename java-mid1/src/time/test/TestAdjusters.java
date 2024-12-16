package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * 문제4 - 시작 요일, 마지막 요일 구하기<p>
 * 입력 받은 월의 첫날 요일과 마지막날 요일을 구해라.<p>
 */
public class TestAdjusters {

  public static void main(String[] args) {
    // 2024년 1월 1일
    LocalDate date = LocalDate.of(2024, 1, 1);

    // 해당월의 첫번째 요일 - firstDayOfMonth
    DayOfWeek firstDayOfWeek = date.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
    // 마지막날 요일- lastDayOfMonth
    DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
    System.out.println("firstDayOfWeek = " + firstDayOfWeek);
    System.out.println("lastDayOfWeek = " + lastDayOfWeek);
  }
}
