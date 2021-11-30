package JavaCollections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(10);
        vector.add("Java");
        vector.add("Python");
        vector.addElement("GoLang");
        System.out.println(vector);
        vector.forEach(System.out::println);
    }
}
