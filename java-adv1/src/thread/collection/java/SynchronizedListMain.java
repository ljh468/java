package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListMain {

    public static void main(String[] args) {
        // 동기화가 적용된 리스트 생성 (프록시 컬렉션)
        // class java.util.Collections$SynchronizedRandomAccessList
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        list.add("data1");
        list.add("data2");
        list.add("data3");
        System.out.println(list.getClass());
        System.out.println("list = " + list);
    }
}
