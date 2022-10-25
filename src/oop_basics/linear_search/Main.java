package oop_basics.linear_search;


public class Main {
    public static void main(String[] args) {
        // LINEAR SEARCH == Iterate through a collection one element at a time

        //                  runtime complexity: O(n)

        //                  Disadvantages:
        //                  Slow for large data sets

        //                  Advantages:
        //                  Fast for searches of small to media data sets
        //                  Does not need to be sorted
        //                  Useful for data structures that do not have random access (Linked List)

        int[] array = {4,5,7,0,2,4,7,4,2,8};

        int index = linearSearch(array,10);

        if(index != -1){
            System.out.println("Element found at index " + index);
        }else {
            System.out.println("Element not found at index " + index);
        }

    }

    private static int linearSearch(int[] array, int value) {
        // TODO Auto-generated method stub
        for (int j = 0; j < array.length; j++) {
            if(array[j] == value){
                return j;
            }
        }
        return 0;
    }
}
