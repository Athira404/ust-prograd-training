import java.util.InputMismatchException;

public class Rectangle {
//    public double area(double length , double breadth){
//        return 15;
//    }

    public double area(double length , double breadth){
        if(length<0 || breadth<0){
            throw new InputMismatchException("Can't have negative value ");
        }
        if(length==0 || breadth==0){
            throw new InputMismatchException("Value cannot be zero");
        }
        return length * breadth;
    }
}
