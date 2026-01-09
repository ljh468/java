package thread.collection.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapMain {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new ConcurrentHashMap<>();
        map1.put(3, "data3");
        map1.put(2, "data2");
        map1.put(1, "data1");
        // 입력 순서는 보장하지 않는 `HashMap` 대안
        System.out.println("map1 = " + map1);


        Map<Integer, String> map2 = new ConcurrentSkipListMap<>();
        map2.put(2, "data2");
        map2.put(3, "data3");
        map2.put(1, "data1");
        // 입력 순서를 보장하는 `TreeMap` 대안 (Comparator 가능)
        System.out.println("map2 = " + map2);
    }
}
