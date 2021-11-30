package JavaCollections;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(28);
        list.add(45);
        list.add(10);
        deque.add(10);
        deque.add(20);
        deque.addFirst(13);
//        System.out.println(deque.peek());
//        System.out.println(deque.peekLast());
//        System.out.println(deque);
//        System.out.println(deque.poll());
//        System.out.println(deque);
        deque.clear();
        deque.add(100);
        deque.add(200);
        deque.addAll(list);
        System.out.println(deque);
        deque.removeAll(list);
        System.out.println(deque);


    }
}
