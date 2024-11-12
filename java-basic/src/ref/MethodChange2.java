package ref;

// 참조형의 메서드 호출
public class MethodChange2 {

  public static void main(String[] args) {
    Data dataA = new Data();
    dataA.value = 10;
    System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
    System.out.println("dataA=" + dataA); // dataA의 참조값
    changeReference(dataA);
    System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
  }

  static void changeReference(Data dataX) {
    System.out.println("dataX=" + dataX); // dataX 참조값
    dataX.value = 20; // 참조값의 value에 20 대입
  }
}
