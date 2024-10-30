public class ItemCounter {

  public static int totalCount = 0;

  public void addItem() {
    totalCount++;
  }

  private static int getTotalCount() {
    return totalCount;
  }

  // `totalCount` 변수가 인스턴스마다 공유되는지 확인
  public static void main(String[] args) {
    // counter1 인스턴스 생성
    ItemCounter counter1 = new ItemCounter();
    // counter2 인스턴스 생성
    ItemCounter counter2 = new ItemCounter();

    System.out.println("counter1 totalCount: " + ItemCounter.getTotalCount());
    System.out.println("counter2 totalCount: " + ItemCounter.getTotalCount());
    System.out.println();

    // 각 인스턴스를 통해 아이템 추가
    System.out.println("counter1 인스턴스 아이템 추가");
    counter1.addItem();

    System.out.println("counter2 인스턴스 아이템 추가");
    counter2.addItem();

    System.out.println("counter1 인스턴스 아이템 추가");
    counter1.addItem();
    System.out.println();

    // totalCount 확인
    System.out.println("ItemCounter totalCount: " + ItemCounter.getTotalCount());
  }
}