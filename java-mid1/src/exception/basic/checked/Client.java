package exception.basic.checked;

public class Client {

  public void call() throws MyCheckedException {
    // 예외 문제 발생
    throw new MyCheckedException("MyCheckedException");
  }
}
