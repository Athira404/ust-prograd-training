public class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Can't have negative or Zero input value ");
        }
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return (length * breadth);
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }


//    public double perimeter2(String length , String breadth){
//        throw new IllegalArgumentException("Can't have String value ");
//    }
}


