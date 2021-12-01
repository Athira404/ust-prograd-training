package Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> cards = new LinkedList<>();
        cards.add(10);
        cards.add(0,2);
        cards.addLast(13);
        cards.add(1);
        System.out.println(cards);
        cards.set(1,9);
        cards.forEach(System.out::println); //linkedList.forEach(System.out.println(num));
        for(int i=0;i<cards.size();i++){
            System.out.println(cards.get(i));
        }
        for(Integer x : cards){
            System.out.println(x);
        }
        for(Iterator<Integer> obj = cards.iterator(); obj.hasNext();){
            System.out.println(obj.next());
        }
        System.out.println();
        System.out.println(cards.remove());//2
        System.out.println(cards.remove());//9
    }
}

