package Map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMap {
    public static void main(String[] args) {
        TreeMap<String , String> map = new TreeMap<>();
//        TreeMap<String , String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);-->comparator
        map.put("Apple", "Fruit");
        map.put("Carrot", "Vegetable");
        map.put("Grapes", "Fruit");//based on ascii values
        System.out.println(map);
    }
}
