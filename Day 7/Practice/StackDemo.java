package JavaCollections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("R");
//        stack.pop();
        System.out.println(stack);
        stack.forEach(System.out::println);
    }
}
