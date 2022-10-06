package unit_methods;

import java.util.Scanner;

public class Members {
    // instance variables
    static int x = 5; // global/class variable
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(x);

        foo();
        bar();
    }

    public static void foo(){
        sc.nextDouble();
        System.out.println(x);
        x = 10;
    }

    public static void bar(){
        System.out.println(x);
    }
}
