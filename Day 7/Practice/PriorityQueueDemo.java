package JavaCollections;

import java.util.Collections;
import java.util.PriorityQueue;
//PriorityQueue --> heap-->min heap
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(11);
        pq.add(2);//Minimum
        pq.add(6);
        System.out.println(pq);//2 is min
        pq.poll();//2 will be removed
        System.out.println(pq);//5 is min



        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(10);
        pq2.add(5);
        pq2.add(11);
        pq2.add(2);
        pq2.add(6);
        System.out.println(pq2);
        pq2.poll();
        System.out.println(pq2);

    }
}
