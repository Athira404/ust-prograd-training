// As a statistician, I want to be able to know that the probability of a heads in a coin toss is
// equal to the probability of a tails in a coin toss.
// As a statistician, I want to be able to know the probability of two events occurring together.
// As a statistician, I want to be able to know the probability of an event not occurring.
// As a statistician, I want to be able to know the probability of either two events occurring.

public class Statistics {

//    double probabilityOfHead;
//    double probabilityOfTail;
//    String eventOccurred;
//    double probabilityOfEventOccurred;
//    Statistics(double probabilityOfHead, double probabilityOfTail){
//        if(probabilityOfHead<0 || probabilityOfTail<0){
//            throw new IllegalArgumentException("Probability cannot be negative");
//        }
//        this.probabilityOfHead = probabilityOfHead;
//        this.probabilityOfTail = probabilityOfTail;
//    }
//    Statistics(String eventOccurred, double probabilityOfEventOccurred){
//        if (eventOccurred.equals("Head") || eventOccurred.equals("Tail")){
//            probabilityOfEventNotOccurring();
//        }
//    }

    public boolean probabilityOfHeadAndTailEquals(double probabilityOfHead,double probabilityOfTail) {
        if(probabilityOfHead == probabilityOfTail)
            return true;

        return false;
    }

    public double probabilityOfHeadAndTailOccursTogether(double probabilityOfHead,double probabilityOfTail) {
        return probabilityOfHead * probabilityOfTail;
    }

    public double probabilityOfEventNotOccurring(String eventOccurred,double probabilityOfEventOccurred) {
        if (eventOccurred.equals("Head") || eventOccurred.equals("Tail"))
            return 1 - probabilityOfEventOccurred;   // probability of event not occurred = 1 - probability of event occurred;
        return 0;
    }

    public double probabilityOfEitherTwoEventsOccurring(double probabilityOfHead,double probabilityOfTail){
        return probabilityOfHead + probabilityOfTail;
    }
}