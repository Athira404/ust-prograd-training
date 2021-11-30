package JavaCollections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(10);
        hs.addAll(List.of(3,5,8,6));
        hs.add(5);//not added (only unique elements), no duplicates allowed
        hs.add(0);
        hs.add(-8);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(10);
        lhs.addAll(List.of(3,5,8,6));
        lhs.add(5);//not added (only unique elements), no duplicates allowed
        lhs.add(0);
        lhs.add(-8);
        System.out.println(lhs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(10);
        ts.addAll(List.of(3,5,8,6));
        ts.add(5);//not added (only unique elements), no duplicates allowed
        ts.add(0);
        ts.add(-8);
        System.out.println(ts);
    }
}
