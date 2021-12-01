package Collection;

import java.util.Collections;
import java.util.PriorityQueue;
//PriorityQueue --> heap-->min heap
public class Priorityqueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> marks = new PriorityQueue<>();
        marks.add(89);
        marks.add(98);
        marks.add(56);
        marks.add(77);
        marks.add(32);
        System.out.println(marks);
        System.out.println("Minimum marks is "+marks.poll());//min will be removed
        System.out.println(marks);

        PriorityQueue<Integer> marks2 = new PriorityQueue<>(Collections.reverseOrder());
        marks2.add(89);
        marks2.add(92);
        marks2.add(33);
        marks2.add(80);
        marks2.add(57);
        System.out.println(marks2);
        System.out.println("Maximum mark is "+marks2.poll());
        System.out.println(marks2);

    }
}
