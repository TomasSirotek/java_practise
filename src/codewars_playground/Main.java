package codewars_playground;

public class Main {
    public static void main(String[] args) {
          // double result =  sum(new double[] {1, 2, 3});
          // System.out.print(result);
    }


    public static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
