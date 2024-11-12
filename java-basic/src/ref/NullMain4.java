package ref;

public class NullMain4 {

  public static void main(String[] args) {
    BigData bigData = new BigData();
    bigData.data = new Data(); // data에 참조할 객체를 넣어줌
    System.out.println("bigData.count =" + bigData.count);
    System.out.println("bigData.data =" + bigData.data);

    // NullPointerException 예외가 발생하지 않는다.
    System.out.println("bigData.data.value = " + bigData.data.value); // bigData.data.value = 0
  }
}
