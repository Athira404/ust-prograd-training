package Collection;

import java.util.Stack;

public class StackPlate {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("plate1");
        stack.push("plate2");
        stack.push("plate3");
        stack.push("plate4");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        stack.forEach(System.out::println);
        stack.removeAll(stack);
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}



