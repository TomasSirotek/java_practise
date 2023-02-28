package leetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,1};
//        int[] arr2 = {1,2,3,4};
//        int[] arr3 = {1,1,1,3,3,4,3,2,4,2};
//
//        System.out.println(containsDuplicate(arr));
//        System.out.println(containsDuplicate(arr2));
//        System.out.println(containsDuplicate(arr3));

        System.out.println(isAnagram("ab","ba"));
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


    public static boolean isAnagram(String s, String t) {
        // return true if t(String) is a anagram of s
        // else return true


        // s = "anagram" , t = "nagaram" / true
        // s = "rat" , t = "car" / true

        // iterate throught the s and find if all letters match the letter exist in the t (string)
        // if does not exist then return false
        // if exist continue

        boolean isPresent = true;

        if (s.length() != t.length()) {
            isPresent = false; // If the lengths are not equal, they cannot be anagrams.
        } else {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            isPresent = Arrays.equals(sArray, tArray); // Compare the sorted arrays to check for anagrams.
        }

        return isPresent;

    }



}
