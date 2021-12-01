package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(89);
        marks.add(78);
        marks.add(60);
        marks.add(56);
        marks.add(95);
        Collections.sort(marks);
        marks.forEach(System.out::println);
        System.out.println("Minimum mark scored is "+ marks.get(0));
    }
}
