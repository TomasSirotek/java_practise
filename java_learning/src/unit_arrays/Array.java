package unit_arrays;

public class Array {
    public static void main(String[] args) {


        int[] b = {30,30,60,70};

        //  Iterations
        int cunt = 0;
        int totalSum = 0;

        for (int i : b) {
            if(i > 30){
                cunt++;
            }
            // Adding total sum
            totalSum += i;
        }
        // Getting mean value ( sum divided by its count )
        double meanValue = (double)totalSum / b.length;

        System.out.println(totalSum + " " + meanValue);

    }
}
