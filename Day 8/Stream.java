import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(List.of(89,98,78,55));

        int sum = marks.stream()
                .mapToInt(i -> i)//mapToInt -->maps to Integer (auto boxing)
                .sum();
        System.out.println(sum);

//        IntSummaryStatistics summaryStatistics = marks.stream()
//                .mapToInt(i -> i)
//                .summaryStatistics();
//        System.out.println(summaryStatistics);
//        System.out.println(summaryStatistics.getAverage());




//        marks.stream()
//                .filter(x -> x>70)//lambda expression
//                .sorted()// 78 89 98
//                .skip(2)//skips first two vales o/p is 98 only
//                .findFirst()
//                .ifPresent(System.out::println);
////                .forEach(System.out::println);


    }
}
