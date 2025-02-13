package collection.compare.test;

/**
 * 문제와 풀이<p>
 * 카드 게임을 만들어보자.<p>
 * **요구사항**<p>
 * 카드( `Card` )는 1 ~ 13까지있다. 각 번호당 다음 4개의 문양이 있다.<p>
 * ♠: 스페이드, ♥: 하트, ♦: 다이아, ♣: 클로버<p>
 * 예) 1(♠), 1(♥), 1(♦), 1(♣), 2(♠), 2(♥), 2(♦), 2(♣) ... 13(♠), 13(♥), 13(♦), 13(♣) 따라서 13 * 4 = 총 52장의 카드가 있다.<p>
 * 52장의 카드가 있는 카드 뭉치를 덱( `Deck` )이라 한다.<p>
 * 2명의 플레이어( `Player` )가 게임을 진행한다.<p>
 * <br>
 * 게임을 시작하면 다음 순서를 따른다.<p>
 * 1. 덱에 있는 카드를 랜덤하게 섞는다.<p>
 * 2. 각 플레이어는 덱에서 카드를 5장씩 뽑는다.<p>
 * 3. 각 플레이어는 5장의 카드를 정렬된 순서대로 보여준다.<p>
 * - 정렬 기준은 다음과 같다. 작은 숫자가 먼저 나온다.<p>
 * - 같은 숫자의 경우 ♠, ♥, ♦, ♣ 순으로 정렬한다. ♠가 가장 먼저 나온다.<p>
 * - 예) 1(♠), 1(♥), 2(♦), 3(♣) 순서로 출력된다.<p>
 * 4. 카드 숫자의 합계가 큰 플레이어가 승리한다.<p>
 * - 게임을 단순화 하기 위해 숫자만 출력한다.<p>
 * - 합계가 같으면 무승부이다.<p>
 */
public class CardGameMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    Player player1 = new Player("플레이어1");
    Player player2 = new Player("플레이어2");

    for (int i = 0; i < 5; i++) {
      player1.drawCard(deck);
      player2.drawCard(deck);
    }

    player1.showHand();
    player2.showHand();

    // 변수를 선언하고 값을 바로 세팅
    Player winner = getWinner(player1, player2);

    if (winner != null) {
      System.out.println(winner.getName() + " 승리");
    } else {
      System.out.println("무승부");
    }
  }

  private static Player getWinner(Player player1, Player player2) {
    int sum1 = player1.rankSum();
    int sum2 = player2.rankSum();

    if (sum1 > sum2) {
      return player1;
    } else if (sum1 == sum2) {
      return null;
    } else {
      return player2;
    }
  }
}
