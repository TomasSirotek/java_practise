package unit_methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = a;

        int[] x = {3,22,4,16,8}; // x = [I@4517d9a3 (address of the array in the memory elsewhere)

        int[] d = foo(x);

        for (int i = 0; i < x.length; i++) {
            System.out.println("x [" + i + "] = " + x[i]);
        }

        // Only primitive variables change separately !!!!

        Scanner sc = new Scanner(System.in); // contains scanner in memory
        System.out.println(sc);

    }
    public static int[] foo(int[] c){
        c[1] = 50;
        return c;
    }

    // function( parameters => i = argument ) so 5 is and argument passed to the function parameters
//    public static double coneVolume(double r,double h){ // r = radius h = height
//        return Math.PI * r * r * h / 3;
//    }

}
