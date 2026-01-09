package thread.collection.java;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {

    public static void main(String[] args) {
        // 멀티쓰레드 환경에서 안전한 세트 구현체 - CopyOnWriteArraySet
        Set<Integer> copySet = new CopyOnWriteArraySet<>();
        copySet.add(1);
        copySet.add(2);
        copySet.add(3);

        // 입력 순서는 보장하지 않는 `HashSet` 대안
        System.out.println("copySet = " + copySet);

        Set<Integer> skipSet = new ConcurrentSkipListSet<>();
        skipSet.add(3);
        skipSet.add(1);
        skipSet.add(2);

        // 입력 순서를 보장하는 `TreeSet` 대안 (Comparator 가능)
        System.out.println("skipSet = " + skipSet);

    }
}
