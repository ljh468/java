package time;

import java.time.LocalTime;

public class LocalTimeMain {

  public static void main(String[] args) {
    LocalTime nowTime = LocalTime.now();
    LocalTime ofTime = LocalTime.of(9, 10, 30);

    System.out.println("현재 시간: " + nowTime);
    System.out.println("지정 시간: " + ofTime);

    // 계산(불변이기 때문에 반환값을 처리해야함)
    ofTime = ofTime.plusSeconds(30);
    System.out.println("지정 시간+30s: " + ofTime);

    ofTime = ofTime.minusSeconds(30);
    System.out.println("지정 시간+30s-30s: " + ofTime);
  }
}
