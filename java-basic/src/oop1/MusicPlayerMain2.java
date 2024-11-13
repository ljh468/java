package oop1;

/**
 * 절차 지향 프로그래밍2 - 데이터 묶음<p>
 * 앞서 작성한 코드에 클래스를 도입하자.<p>
 * `MusicPlayerData` 라는 클래스를 만들고, 음악 플레이어에 사용되는 데이터 들을 여기에 묶어서 멤버 변수로 사용하자.
 */
public class MusicPlayerMain2 {

  public static void main(String[] args) {
    MusicPlayerData data = new MusicPlayerData();

    // 음악 플레이어 켜기
    data.isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");

    // 볼륨 증가
    data.volume++;
    System.out.println("볼륨 증가, 음악 플레이어 볼륨: " + data.volume);

    // 볼륨 증가
    data.volume++;
    System.out.println("볼륨 증가, 음악 플레이어 볼륨: " + data.volume);

    // 볼륨 감소
    data.volume--;
    System.out.println("볼륨 감소, 음악 플레이어 볼륨: " + data.volume);

    //음악 플레이어 상태
    System.out.println("음악 플레이어 상태 확인");
    if (data.isOn) {
      System.out.println("음악 플레이어: ON, 볼륨: " + data.volume);
    } else {
      System.out.println("음악 플레이어: OFF");
    }

    //음악 플레이어 끄기
    data.isOn = false;
    System.out.println("음악 플레이어를 종료합니다.");
  }
}
