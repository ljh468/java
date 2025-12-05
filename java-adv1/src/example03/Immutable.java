package example03;

public class Immutable {

    // `value` 필드(멤버 변수)는 공유되는 값
    // 멀티스레드 상황에서 문제가 될 수 있을까?
    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
