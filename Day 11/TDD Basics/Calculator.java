public class Calculator {
//    public double add(double a , double b){
//        return 8;
//    }
    public double add(double a , double b){
        return a + b;
    }
//    public double sub(double a , double b){ //-->First goal is to pass the test case dw abt logic
//        return 7;
//    }
    public double sub(double a , double b){
        return a - b;
    }

    public double div(double a , double b){
        if (b==0){throw new ArithmeticException("Can't divide byy zero"); }
        return a/b;
    }
    public double mul(double a , double b){
        return a * b;
    }
}
