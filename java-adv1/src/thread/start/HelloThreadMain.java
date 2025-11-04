package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        // run() 호출 하면 안됨
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start(); // -> 다른 쓰레드에 넘기기
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
