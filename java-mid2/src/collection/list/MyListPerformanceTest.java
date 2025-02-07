package collection.list;

public class MyListPerformanceTest {

  public static final int LOOP = 10000;

  public static final int SIZE = 50_000;

  public static void main(String[] args) {
    MyArrayList<Integer> arrayList = new MyArrayList<>();
    MyLinkedList<Integer> linkedList = new MyLinkedList<>();

    System.out.println("#### MyArrayList 추가 ####");
    addFirst(arrayList, SIZE);
    addMid(arrayList, SIZE);
    addLast(arrayList, SIZE);
    System.out.println();

    System.out.println("#### MyLinkedList 추가 ####");
    addFirst(linkedList, SIZE);
    addMid(linkedList, SIZE);
    addLast(linkedList, SIZE);
    System.out.println();

    System.out.println("#### MyArrayList 조회 ####");
    getIndex(arrayList, LOOP, 0); // 맨앞 조회
    getIndex(arrayList, LOOP, SIZE / 2); // 중간 조회
    getIndex(arrayList, LOOP, SIZE - 1); // 맨뒤 조회
    System.out.println();

    System.out.println("#### MyLinkedList 조회 ####");
    getIndex(linkedList, LOOP, 0);
    getIndex(linkedList, LOOP, SIZE / 2);
    getIndex(linkedList, LOOP, SIZE - 1);
    System.out.println();

    System.out.println("#### MyArrayList 데이터 검색 ####");
    search(arrayList, LOOP, 0);
    search(arrayList, LOOP, SIZE / 2);
    search(arrayList, LOOP, SIZE - 1);
    System.out.println();

    System.out.println("#### MyLinkedList 데이터 검색 ####");
    search(linkedList, LOOP, 0);
    search(linkedList, LOOP, SIZE / 2);
    search(linkedList, LOOP, SIZE - 1);
  }

  // 맨 앞에 데이터 추가
  private static void addFirst(MyList<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(0, i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
  }

  // 중간에 데이터 추가
  private static void addMid(MyList<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(i / 2, i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
  }

  // 마지막에 데이터 추가
  private static void addLast(MyList<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
  }

  // 인덱스 접근
  private static void getIndex(MyList<Integer> list, int loop, int index) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < loop; i++) {
      list.get(index);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
  }

  // 데이터 검색
  private static void search(MyList<Integer> list, int loop, int findValue) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < loop; i++) {
      list.indexOf(findValue);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
  }
}