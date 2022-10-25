package oop_basics.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[1_000_000];
        int target = 7_76_0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array,target);

        if(index == -1){
            System.out.println("Target not found"+ target);
        }else {
            System.out.println("Element found at" + index);
        }

        ArrayList<User> l = new ArrayList<User>();
        l.add(new User(100,"Tomas"));
        l.add(new User(90,"Adam"));
        Collections.sort(l,new Comparator());


    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle" + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle;
        }
        return -1; // not found

    }
}
