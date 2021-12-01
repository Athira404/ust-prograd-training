package Collection;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> carddeck1 = new HashSet<>();
        carddeck1.add(13);
        carddeck1.add(2);
        carddeck1.addAll(List.of(4,3,7,6,5,9,8));
        carddeck1.add(10);
        carddeck1.add(11);
        carddeck1.add(1);
        carddeck1.add(12);
        carddeck1.add(12);//no duplicates allowed
        System.out.println("Total cards " + carddeck1);
        System.out.println(carddeck1.contains(12));
        System.out.println(carddeck1.stream().min(Comparator.comparingInt(Integer::intValue)));
        System.out.println(carddeck1.stream().max(Comparator.comparingInt(Integer::intValue)));

        HashSet<Integer> carddeck2 = new HashSet<>();
        carddeck2.addAll(List.of(3,6,7,9,5,14));
        System.out.println(carddeck2);
        carddeck1.retainAll(carddeck2);//intersection
        System.out.println(carddeck1);
        System.out.println("Pick the card " + carddeck2.remove(2));
        carddeck1.forEach(System.out::println);
    }
}
