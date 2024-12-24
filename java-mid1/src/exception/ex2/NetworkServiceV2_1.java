package exception.ex2;

public class NetworkServiceV2_1 {

  // throws 예외를 던짐 (반환을 할 필요가 없다. - void)
  public void sendMessage(String data) throws NetworkClientExceptionV2 {
    String address = "http://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);
    client.initError(data); // 추가

    client.connect();
    client.send(data);
    client.disconnect();
  }
}
