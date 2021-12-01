package Collection;
// no capacity restrictions;
// they grow as necessary to support usage
// that allows us to add or remove an element from both sides but cant add in middle
// implementation can be used as a Stack or a Queue
// does not provide the thread synchronization
// null elements not allowed

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> shelf1 = new ArrayDeque<>(10);
        ArrayDeque<String> shelf2 = new ArrayDeque<>();
        shelf1.addFirst("Book1");
        shelf1.addLast("Book5");
        shelf1.add("Book2");
        System.out.println("Things in shelf 1 " + shelf1);
        shelf2.add("Candles");
        shelf2.add("Vase");
        shelf2.add("Toys");
        System.out.println("Things in Shelf 2 " + shelf2);
        shelf1.addAll(shelf2);
        System.out.println("After insertion, Things in  shelf one --> " + shelf1);
        System.out.println("Remove the first thing in shelf 1 " + shelf1.remove());
        System.out.println("Top thing in shelf 1 --> " + shelf1.peek());
        System.out.println("Remove Head element in shelf 1 --> " + shelf1.poll());
        System.out.println("Last element in shelf 1 --> " + shelf1.peekLast());
        System.out.println("Shelf 2 --> " + shelf2);
        System.out.println("Shelf 1 --> " + shelf1);
        shelf1.forEach(System.out::println);
    }
}
