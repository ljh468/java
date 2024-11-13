package oop1;

/**
 * ## 객체 지향 프로그래밍 ##<p>
 * 지금까지 개발한 음악 플레이어는 데이터와 기능이 분리되어 있었다.<p>
 * 이제 데이터와 기능을 하나로 묶어서 음악 플레이 어라는 개념을 온전히 하나의 클래스에 담아보자.<p>
 * 프로그램의 실행 순서 보다는 음악 플레이어 클래스를 만드는 것 자체에 집중해야 한다. 음악 플레이어 가 어떤 속성(데이터)을 가지고 어떤 기능(메서드)을 제공하는지 이 부분에 초점을 맞추어야 한다.
 */
public class MusicPlayer {

  // 속성(데이터)
  int volume = 0;

  boolean isOn = false;

  // 기능(메서드)
  void on() {
    isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");
  }

  void off() {
    isOn = false;
    System.out.println("음악 플레이어를 종료합니다.");
  }

  void volumeUp() {
    volume++;
    System.out.println("불륨 증가, 음악 플레이어 볼륨: " + volume);
  }

  void volumeDown() {
    volume--;
    System.out.println("볼륨 감소, 음악 플레이어 볼륨: " + volume);
  }

  void showStatus() {
    System.out.println("음악 플레이어 상태 확인");
    if (isOn) {
      System.out.println("음악 플레이어: ON, 볼륨: " + volume);
    } else {
      System.out.println("음악 플레이어: OFF");
    }
  }

}
