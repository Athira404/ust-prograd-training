package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapUseCase {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "java");
        map.put(3, "Python");
        map.put(2, "C");
        map.put(4, "Go");
        map.put(5, "C++");
        map.putIfAbsent(7, "R");
        map.putIfAbsent(6, "Ruby");
        map.put(7, "SQL ");
        map.putIfAbsent(7, "PLSQL");
        System.out.println(map);
        System.out.println(map.get(2));
//        map.remove(1);
        map.remove(2, "R");//It will remove 2 only if value in 2 is R; false here so it won't remove key 2(like && operation)
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "->" + m.getValue());
        }
    }
}
//    we just have to find out whole differences of using this remove value and key
