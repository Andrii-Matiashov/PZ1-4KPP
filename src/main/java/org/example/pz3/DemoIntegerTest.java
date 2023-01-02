package org.example.pz3;

import java.util.Iterator;

/**
 * Hello world!
 */
public class DemoIntegerTest {
    public static void main(String[] args) {

        MyListImpl<Integer> list = new MyListImpl<>();
        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        System.out.println("While and Iterator<Integer>");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
        System.out.println("Foreach");
        for (Integer elem : list) {
            System.out.print(elem + "\t");
        }
        System.out.println();
        System.out.println("List Contains 11? -> " + list.contains(11));
        System.out.println("List Contains 9? -> " + list.contains(9));
        System.out.println("Remove 5 from list? -> " + list.remove(5));
        System.out.println("Remove 17 from list? -> " + list.remove(17));
        System.out.println("list.toString() after remove -> "+ list);
    }
}
