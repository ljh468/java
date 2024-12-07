package lang.immutable.test;

/**
 * **문제 설명**<p>
 * `MyDate` 클래스는 불변이 아니어서 공유 참조시 사이드 이펙트가 발생한다. 이를 불변 클래스로 만들어라.<p>
 * 새로운 불변 클래스는 `ImmutableMyDate` 로 이름 지으면 된다.<p>
 * 새로운 실행 클래스는 `ImmutableMyDateMain` 으로 이름 지으면 된다.<p>
 */
public class MyDateMain {

  public static void main(String[] args) {
    MyDate date1 = new MyDate(2024, 1, 1);
    MyDate date2 = date1;
    System.out.println("date1 = " + date1);
    System.out.println("date2 = " + date2);

    System.out.println("2025 - > date1");
    date1.setYear(2025); // 공유된 객체의 값을 변경하면 사이드 이펙트가 발생한다
    System.out.println("date1 = " + date1);
    System.out.println("date2 = " + date2);
  }
}
