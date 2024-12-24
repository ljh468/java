package exception.ex2;

public class NetworkServiceV2_5 {

  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV2 client = new NetworkClientV2(address);
    client.initError(data); // 추가

    try {
      client.connect();
      client.send(data);
    } catch (NetworkClientExceptionV2 e) {
      System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
    }
    // finally 구문을 이용하면 try` , `catch` 안에서 잡을 수 없는 예외가 발생해도 반드시 실행된다.
    finally {
      client.disconnect();
    }

  }
}
