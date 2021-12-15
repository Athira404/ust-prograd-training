public class WeightConverter extends Converter {

    public double gramToGram(double weightInGram) {
        return weightInGram;
    }

    public double kilogramToGram(double weightInKilogram) {
        return weightInKilogram * 1000;
    }

    public double gramToKilogram(double weightInGram) {
        return weightInGram / 1000;
    }

}