public class BmiService {
    public double calculate(double height, int weight) {
        double bmi;
        bmi = weight / (height * height);
        return bmi;
    }
}
