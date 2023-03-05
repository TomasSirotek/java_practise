package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

        //   System.out.println(isAnagram("ab","ba"));

//        var result = twoSum(new int[]{3,2,4}, 6);
//        System.out.println(List.of(result));
//        System.out.println(result[0] + " " + result[1]);

//        int[] arr = {1,2,3,4,5,6,7};
//
//        for (int counter = arr.length - 1; counter >= 0; counter--) {
//            int last = arr[arr.length - 1];
//            System.out.println(arr[counter]);
//        }

//        class DVD {
//            public String name;
//            public int releaseYear;
//            public String director;
//
//            public DVD(String name, int releaseYear, String director) {
//                this.name = name;
//                this.releaseYear = releaseYear;
//                this.director = director;
//            }
//
//            public String toString() {
//                return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
//            }
//        }
//
//        DVD[] dvdCollection = new DVD[10];
//
//        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
//        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
//        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
//
//// Put "The Incredibles" into the 4th place: index 3.
//        dvdCollection[3] = incrediblesDVD;
//
//// Put "Finding Dory" into the 10th place: index 9.
//        dvdCollection[9] = findingDoryDVD;
//
//// Put "The Lion King" into the 3rd place: index 2.
//        dvdCollection[2] = lionKingDVD;
//
//        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
//        dvdCollection[3] = starWarsDVD;
//
//        Arrays.stream(dvdCollection).forEach(System.out::println);
//
//
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        Arrays.stream(arr).forEach(System.out::println);

//        int[] squareNumbers = new int[10];
//
//        // Go through each of the Array indexes, from 0 to 9.
//        for (int i = 0; i < 10; i++) {
//            // We need to be careful with the 0-indexing. The next square number
//            // is given by (i + 1) * (i + 1).
//            // Calculate it and insert it into the Array at index i.
//            int square = (i + 1) * (i + 1);
//            squareNumbers[i] = square;
//        }
//
//        Arrays.stream(squareNumbers).forEach(System.out::println);


       // System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));

        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }


    public static int findNumbers(int[] nums) {
        int count=0;

        for (int num : nums) {
            if ((num > 9 && num < 100) || (num > 999 && num < 10000) || num == 100000) {
                count++;
            }
        }

        return count;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0; // result number of consecutive 1's
        int count = 0; // current count number of consecutive 1's

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            // update max if count is greater
            if (count > result) {
                result = count;
            }
        }

        return result;

    }

    public static int[] twoSum(int[] nums, int target) {
        return null;
        //            int currentNum = nums[i];
//            int nextNum = nums[i + 1];
//
//            if(currentNum + nextNum == target){
//                return new int[]{nums[i], nums[i + 1]};
//            }
//        }
//        return new int[]{};
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
