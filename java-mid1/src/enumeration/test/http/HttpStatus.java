package enumeration.test.http;

/**
 * **문제 설명** <p>
 * `enumeration.test.http` 패키지를 사용하자.<p>
 * `HttpStatus` 열거형을 만들어라.<p>
 * <br>
 * HTTP 상태 코드 정의<p>
 * `OK`<p>
 * - code: 200<p>
 * - message: "OK"<p>
 * <br>
 * `BAD_REQUEST`<p>
 * code: 400<p>
 * message: "Bad Request"<p>
 * <br>
 * `NOT_FOUND`<p>
 * code: 404<p>
 * message: "Not Found"<p>
 * <br>
 * `INTERNAL_SERVER_ERROR`<p>
 * code: 500<p>
 * message: "Internal Server Error"<p>
 * <br>
 * ## 참고 ##: HTTP 상태 코드는 200 ~ 299사이의 숫자를 성공으로 인정한다.<p>
 */
public enum HttpStatus {

  OK(200, "OK"),
  BAD_REQUEST(400, "Bad Request"),
  NOT_FOUND(404, "Not Found"),
  INTERNAL_SERVER_ERROR(500, "Internal Server Error");

  private final int code;

  private final String message;

  HttpStatus(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public static HttpStatus findByCode(int code) {
    for (HttpStatus status : values()) {
      if (status.getCode() == code) {
        return status;
      }
    }
    return null;
  }

  public boolean isSuccess() {
    return code >= 200 && code <= 299;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
