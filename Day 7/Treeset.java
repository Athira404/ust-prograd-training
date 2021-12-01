package Collection;

import java.util.List;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> contact = new TreeSet<>();
        contact.add("Abhi");
        contact.add("Athira");
        contact.add("Kanchana");
        contact.add("Dean");
        contact.add("Joshua");
        contact.add("Phoebe");
        contact.add("Kelly");
        contact.add("Crowlie");
        System.out.println("Contact List --> " + contact);
        System.out.println("PollLast " + contact.pollLast());
        System.out.println("PollFirst " + contact.pollFirst());
        System.out.println(contact.remove("Crowlie"));
        System.out.println("Contact List after removing Crowlie " + contact);
    }
}
