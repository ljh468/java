package thread.collection.java;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListMain {

    public static void main(String[] args) {
        // 멀티쓰레드 환경에서 안전한 리스트 구현체 - CopyOnWriteArrayList
        List<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list = " + list);
    }
}
