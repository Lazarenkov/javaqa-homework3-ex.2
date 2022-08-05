public class Main {
    public static void main(String[] args) {
        BmiService service= new BmiService();
                double height=1.8;     //рост в метрах
                int weight=80;        // вес в килограммах
                double bmi=service.calculate(height, weight);
        String result = String.format("%.1f",bmi);
        System.out.println("ИМТ = " + result);
    }
}
