import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("red", "black", "blue", "yellow", "green"));
        ArrayList<String> filtered = (ArrayList<String>) list.stream().filter(str -> str.startsWith("b")).collect(Collectors.toList());
        System.out.println(filtered);

        ArrayList<Character> charater = new ArrayList<>(Arrays.asList('a','b','d','c'));
        ArrayList<Character> filterchar = (ArrayList<Character>) charater.stream().filter(str -> str.equals('b')).collect((Collectors.toList()));
        System.out.println(filterchar);
    }
}


