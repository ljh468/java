package thread.cas.increment;


import static util.MyLogger.log;

public class IncrementPerformanceMain {

    public static final long COUNT = 100_000_000; // 1억번

    public static void main(String[] args) {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new SyncInteger());
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger incrementInteger) {

        long startMs = System.currentTimeMillis();

        // 1억번 수행
        for (long i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }

        long endMs = System.currentTimeMillis();

        log(incrementInteger.getClass().getSimpleName() + ": ms=" + (endMs - startMs));
        /**
         * /Users/noah/Library/Java/JavaVirtualMachines/corretto-21.0.5/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=62674 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/noah/project/java/java-adv1/out/production/java-adv1 thread.cas.increment.IncreamentPerformanceMain
         * [     main] BasicInteger: ms=59
         * [     main] VolatileInteger: ms=261
         * [     main] SyncInteger: ms=358
         * [     main] MyAtomicInteger: ms=195
         */
    }
}
