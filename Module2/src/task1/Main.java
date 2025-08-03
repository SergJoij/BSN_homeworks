package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args){
        UserHS<Integer> hs1 = new UserHS<>();
        hs1.add(12);
        hs1.add(78);

        hs1.values();
        hs1.remove(12);
        hs1.values();

        UserLL<String> ll = new UserLL<>();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");

        ll.add(2, "Fourth");
        ll.add(0, "Fifth");

        ll.remove("Third");

        System.out.println("vivid");
        ll.values();
        System.out.println(ll.get(3));

        List<String> list = new ArrayList<>();
        list.add("six");
        list.add("seven");

        ll.addAll(1, list);

        System.out.println("-----");
        ll.values();
        System.out.println(ll.get(4));

        HashSet<String> hs = new HashSet<>();
        hs.add("Eight");
        hs.add("Nine");

        ll.addAll(hs);

        System.out.println("-----");
        ll.values();
        System.out.println(ll.get(4));
        System.out.println(ll.length());
    }
}
