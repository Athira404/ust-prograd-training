package JavaCollections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(0,20);
        linkedList.addLast(29);
        linkedList.add(30);
        System.out.println(linkedList);
        linkedList.set(1,34);
//        linkedList.remove();
        linkedList.forEach(System.out::println); //linkedList.forEach(System.out.println(num));
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        for(Integer x : linkedList){
            System.out.println(x);
        }
        for(Iterator<Integer> obj = linkedList.iterator(); obj.hasNext();){
            System.out.println(obj.next());
        }
    }
}
