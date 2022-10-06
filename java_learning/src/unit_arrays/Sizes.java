package unit_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sizes {
    public static void main(String[] args) {
        int[] defualt = {10,20,30,40};
        int[] newArray = new int[5]; // given default value of 0

        boolean[] isArray = {true,false,true,false};
        // Default false
        boolean[] isNewArray = new boolean[3];

        Scanner sc = new Scanner(System.in);
        // Creating empty array with def value of 0
        String[] predics = new String[3];

        predics[0] = "Go up";
        predics[1] = "No hope left";
        predics[2] = "Wohoooo";

        System.out.println("Type number from 1 - 2");
        int input = sc.nextInt();
        System.out.println("Output is " + predics[input - 1 ]); // have to -1 due to the 0 starting count

    }
}
