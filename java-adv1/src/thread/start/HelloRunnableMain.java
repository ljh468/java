package thread.start;

public class HelloRunnableMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        // 스레드와 실행할 작업을 명확히 분리하고,
        // 인터페이스를 사용하므로 `Thread` 클래스를 직접 상속하는 방식보다 더 유연하고 유지보수 하기 쉬움
        // (상속의 제한, 유연성 부족)
        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
