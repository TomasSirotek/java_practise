package leetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(arr2));
        System.out.println(containsDuplicate(arr3));
    }


    public static boolean containsDuplicate(int[] nums) {
        // else return if distinct
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .values()
                .stream()
                .anyMatch(count -> count > 1);
    }
}
