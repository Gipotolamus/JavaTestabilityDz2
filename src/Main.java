public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double w = 84;
        int weight = (int) w;
        double h = 1.8;
        int height = (int) h;
        double bmi = service.calculate(w, h);
        System.out.println((int) bmi);
    }
}