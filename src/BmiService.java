public class BmiService{

    public int calculate (double w, double h) {
        double result = w/(h*h);

            return (int) result;
    }
}
