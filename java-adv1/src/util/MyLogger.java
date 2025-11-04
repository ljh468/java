package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void log(Object object) {

        String time = LocalDateTime.now().format(formatter);
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), object);
        // [    main] : 앞에 5칸 공백
        // [Thread-0] : 앞에 1칸 공백
    }
}
