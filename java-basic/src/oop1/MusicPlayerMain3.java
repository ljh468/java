package oop1;

/**
 * 절차 지향 프로그래밍3 - 메서드 추출<p>
 * 메서드를 만들어서 중복되는 코드를 제거하자<p>
 * - ** 중복 제거: 로직 중복이 제거되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.<p>
 * - ** 변경 영향 범위: 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.<p>
 * - ** 메서드 이름 추가: 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.<p>
 */
public class MusicPlayerMain3 {

  /**
   * 절차 지향 프로그래밍의 한계
   * - 음악 플레이어의 데이터는 MusicPlayerData에 있고, 음악 플레이어와 관련된 기능은 MusicPlayerMain3에 있다.
   * - 음악 플레이어의 데이터는 MusicPlayerData를 사용해야하고, 음악 플레이어와 관련된 기능은 MusicPlayerMain3의 메서드를 사용해야한다.
   * - 데이터와 기능이 분리되면 관리하기 복잡해진다.
   */
  public static void main(String[] args) {
    MusicPlayerData data = new MusicPlayerData();

    //음악 플레이어 켜기
    on(data);
    //볼륨 증가
    volumeUp(data);
    //볼륨 증가
    volumeUp(data);
    //볼륨 감소
    volumeDown(data);
    //음악 플레이어 상태
    showStatus(data);
    //음악 플레이어 끄기
    off(data);
  }

  static void on(MusicPlayerData data) {
    data.isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");
  }

  static void off(MusicPlayerData data) {
    data.isOn = false;
    System.out.println("음악 플레이어를 종료합니다.");
  }

  static void volumeUp(MusicPlayerData data) {
    data.volume++;
    System.out.println("볼륨 증가, 음악 플레이어 볼륨:" + data.volume);
  }

  static void volumeDown(MusicPlayerData data) {
    data.volume--;
    System.out.println("볼륨 감소, 음악 플레이어 볼륨:" + data.volume);
  }

  static void showStatus(MusicPlayerData data) {
    System.out.println("음악 플레이어 상태 확인");
    if (data.isOn) {
      System.out.println("음악 플레이어: ON, 볼륨: " + data.volume);
    } else {
      System.out.println("음악 플레이어: OFF");
    }
  }
}
