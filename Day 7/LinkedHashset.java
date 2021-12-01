package Collection;

import java.util.LinkedHashSet;
import java.util.List;
//not added (only unique elements), no duplicates allowed
public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> card = new LinkedHashSet<>();
        card.add(7);
        card.add(8);
        card.addAll(List.of(8,5,4,6));
        card.add(2);
        card.add(1);
        card.add(13);
        System.out.println(card.size());
        System.out.println(card.isEmpty());
        System.out.println(card.clone());
        System.out.println(card);
    }
}
