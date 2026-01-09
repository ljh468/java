package thread.collection.simple;

import thread.collection.simple.list.BasicList;
import thread.collection.simple.list.SimpleList;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicListUI;

public class SimpleListMainV1 {

    public static void main(String[] args) {
        SimpleList list = new BasicList();

        list.add("A");
        list.add("B");
        System.out.println(list);
    }
}
