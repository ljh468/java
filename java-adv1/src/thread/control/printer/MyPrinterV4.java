package thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static util.MyLogger.log;

public class MyPrinterV4 {

    public static void main(String[] args) {

        Printer printer = new Printer();

        Thread thread = new Thread(printer, "printer");
        thread.start();


        Scanner userInput = new Scanner(System.in);
        while (true) {

            System.out.println("프린터할 문서를 입력하세요. 강제종료 (q): ");
            String input = userInput.nextLine();
            if (input.equals("q")) {
                thread.interrupt(); // interrupt() 즉시 종료
                break;
            }

            printer.addJob(input);
        }
    }

    static class Printer implements Runnable {

        // 여러 쓰레드가 사용하는 큐 사용: ConcurrentLinkedQueue
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {

            // 직접 인터럽트 상태를 확인
            while (!Thread.interrupted()) {

                if (jobQueue.isEmpty()) {
                    Thread.yield(); // 다른 쓰레드가 실행 할 수 있도록 양보
                    continue;
                }

                try {
                    String job = jobQueue.poll();

                    log("출력 시작: " + job + ", 대기 문서: " + jobQueue);
                    Thread.sleep(3000);
                    log("출력 완료: " + job);

                } catch (InterruptedException e) {
                    log("즉시");
                    break;
                }
            }

            log("프린터 종료");
        }

        public void addJob(String input) {
            jobQueue.offer(input);
        }

    }
}
