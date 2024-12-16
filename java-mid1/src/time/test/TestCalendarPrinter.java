package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * 문제6 - 달력 출력하기<p>
 * 실행 결과를 참고해서 달력을 출력해라.<p>
 * 입력 조건: 년도, 월<p>
 * 실행시 날짜의 간격에는 신경을 쓰지 않아도 된다. 간격을 맞추는 부분은 정답을 참고하자.<p>
 */
public class TestCalendarPrinter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("년도를 입력하세요: ");
    int year = scanner.nextInt();

    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();

    printCalender(year, month);
  }

  private static void printCalender(int year, int month) {
    LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
    LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

    // 월요일=1(1%7=1) ... 일요일7(7%7=0)
    // .getDayOfWeek().getValue() - 요일의 인덱스를 반환
    int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7; // 첫번째 날짜가 아닌 날짜는 공백으로 채우기 위함 (몇칸 띄울지)
    System.out.println("Su Mo Tu We Th Fr Sa ");
    for (int i = 0; i < offsetWeekDays; i++) {
      System.out.print("   ");
    }

    LocalDate dayIterator = firstDayOfMonth;
    // 다음날 전까지 반복
    while (dayIterator.isBefore(firstDayOfNextMonth)) {
      System.out.printf("%2d ", dayIterator.getDayOfMonth()); // 일(월의 몇 번째 날)을 반환
      if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) { // 토요일마다 줄바꿈
        System.out.println();
      }
      dayIterator = dayIterator.plusDays(1);
    }
  }
}
