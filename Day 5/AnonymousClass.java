@FunctionalInterface
interface Addition{
    public int add(int a , int b);
}
interface Subtraction{
    public int sub(int a , int b);
}
interface Multiplication{
    public int multi(int a , int b);
}
interface Division{
    public int div(int a , int b);
}

public class AnonymousClass {
    public static void main(String[] args) {
        Addition addable = (int a, int b) ->
        {return (a+b);};
        Subtraction subtraction = (int a, int b) ->
        {return (a-b);};
        Multiplication multiplication = (int a, int b) ->
        {return (a*b);};
        Division division = (int a, int b) ->
        {return (a/b);};
        System.out.println("Addition " + addable.add(4,5));
        System.out.println("Subtraction " + subtraction.sub(87,37) );
        System.out.println("Multiplication " + multiplication.multi(5,8));
        System.out.println("Division " + division.div(9,3));
    }
}








