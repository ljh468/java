package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;

  private int size = 0;

  public MyArrayListV2() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV2(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(Object e) {
    // 배열이 꽉차면, 크기를 늘려야함
    if (size == elementData.length) {
      System.out.println("== 배열의 크기를 2배로 늘림 ==");
      grow();
    }
    elementData[size] = e;
    size++;
  }

  private void grow() {
    // 배열 크기를 2배로 늘림
    int newCapacity = elementData.length * 2;

    // 기존 배열을 복사하고 새로운 크기만큼 새배열을 만들어줌
    elementData = Arrays.copyOf(elementData, newCapacity); // 그리고, elementData 참조를 변경
  }

  public Object get(int index) {
    return elementData[index];
  }

  public Object set(int index, Object element) {
    Object oldValue = get(index);
    elementData[index] = element;
    return oldValue;
  }

  public int indexOf(Object o) {
    for (int i = 0; i < size; i++) {
      if (o.equals(elementData[i])) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size))
        + " size=" + size + ", capacity=" + elementData.length;
  }

}