import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int div = x/y;
            System.out.println(div);

        }
        catch(InputMismatchException imme){
            System.out.println("java.util.InputMismatchException");
        } catch(ArithmeticException ae){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}