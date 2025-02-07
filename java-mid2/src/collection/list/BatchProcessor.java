package collection.list;

public class BatchProcessor {

  private final MyList<Integer> list;

  // 생성자를 통해서 밖에서 구현체 결정을 함 (객체의 생성 시점으로 구현을 미룬다)
  public BatchProcessor(MyList<Integer> list) {
    this.list = list;
  }

  public void logic(int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(0, i); // 앞에 추가
    }
    long endTime = System.currentTimeMillis();
    System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
  }

}