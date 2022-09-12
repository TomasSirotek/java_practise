package unit_arrays;

import java.util.Scanner;

public class Races {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of laps ? ");
        int input = scanner.nextInt();


        double[] lapTimes = new double[input];

        for (int i = 0; i < input; i++) {
            System.out.println("Lap Time " + (i + 1) + "?" );
            lapTimes[i] = scanner.nextDouble();
        }
        // fastest time 2,4
        // i = 4
        double fastestTime = lapTimes[0];

        for (int i = 1; i < lapTimes.length; i++){
            if(lapTimes[i] < fastestTime){
                fastestTime = lapTimes[i];
            }
        }
        System.out.println("Fatest time " + fastestTime);
    }
}
