package oop_basics.linear_search_2;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    private static int[] array = new int[15];
    public static void main(String[] args) {
        printArray();
        randomizeArray();
        printArray();

        int searchInt = 6;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchInt){
                System.out.println("Found " + searchInt + i);
            }
        }


    }
    private static void printArray(){
        for (int i: array
             ) {
            System.out.print(i + " - ");
        }
        System.out.println();
    }

    private static void randomizeArray(){
        Random random = new Random(1337);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

    }

}
