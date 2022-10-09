package codewars_playground;

import unit_arrays.Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // String result = whoLikesIt("Alex");
        String result2 = whoLikesIt("Jacob", "Alex");
        int result = digital_root(942);
        String test = expandedForm(86040);
        int[] resultArr = digitize(54321);
        var testtt = camelCase2("camelCasing");
        // System.out.print(result);
        System.out.print(test);

    }


    public static String camelCase2(String input) {

        char text = ' ';

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(" ");
            }

            result.append(input.charAt(i));
        }

        System.out.println(result.toString());
        // text += new String(" ");
        String padded = input;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) { // find camel case
               // add space at position before
                System.out.println(input.charAt(i));
                System.out.println(input.charAt(i - 1));


                 char test = (char) (input.charAt(i-1) + ' ');

                System.out.println(padded);
                System.out.println(test);

                // input.charAt(i);
                //input.charAt(i);
            }
        }


        return padded;
    }

    public static int[] digitize(long n) {
        String[] str = Long.toString(n).split("");
        Collections.reverse(Arrays.asList(str));

        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }


    public static String expandedForm(int num)
    {
        String[] str = Integer.toString(num).split("");
        String result;
        for(int i = 0; i < str.length-1; i++) {
            if(Integer.parseInt(str[i]) > 0) {
                for(int j = i; j < str.length-1; j++) {
                    str[i] += '0';
                }
            }
        }
        result = Arrays.toString(str);
        result = result.substring(1, result.length()-1).replace(", 0","").replace(",", " +");
        return result;
    }


    public static int digital_root(int n) {
        int root = 0;
        while(n > 0 || root > 9)
        {
            if (n == 0) {
                n = root;
                root = 0;
            }
            root += n % 10;
            n /= 10;
        }
        System.out.println("Sum of Digits: "+root);
        return root;
    }


    public static String whoLikesIt(String... names) {
        String[] namesArr = names.clone();
        // if > 0 else no one
        // if > 1 add "and"
        // if > 2 after first "," name and name
        // if > 3 after first "," Alex, Jacob and 2 others like this
        String finalMessage = "";

        if(names.length == 1){
            finalMessage = names[0] + " likes this";
        } else if(names.length == 2){
            finalMessage = names[0] + " and " + names[1]+ " like this";
        } else if (names.length == 3) {
            finalMessage = names[0] + "," + names[1]+ " and " + names[2] + " like this";
        } else if (names.length > 3) {
            finalMessage = names[0] + "," + names[1]+ " and " + (names.length - 2) + " other like this";
            // "Alex, Jacob and 2 others like this"
        } else {
            finalMessage = "no one likes the post";
        }
        return finalMessage;
    }

    public static String camelCase(String str) {
        String[] words = str.split("\\s");
        StringBuilder capitalizeWord= new StringBuilder();
        for(String w:words){
            if(!w.isEmpty()){
                String first= w.substring(0,1);
                String afterFirst= w.substring(1);
                capitalizeWord.append(first.toUpperCase()).append(afterFirst);
            }
        }
        return capitalizeWord.toString().trim();
    }

    public static int min(int[] list) {
        return Arrays.stream(list).min().orElse(0);
    }
    public static int points(String[] games) {
        final int winPoints = 3,
                  lossPoints = 0,
                  tiePoints = 1;
        char convert = '0';
        int resultScore = 0;

        for (String game : games) {
            int playerX = game.charAt(0) - convert;
            int playerY = game.charAt(2) - convert;
            if (playerX > playerY) {
                resultScore += winPoints;
            } else if (playerX == playerY) {
                resultScore += tiePoints;
            } else {
                resultScore += lossPoints;
            }
        }
        return resultScore;
    }

    public static String reverseWords(final String original)
    {
        String[] words = original.split("\\s");
        StringBuilder reverseWord= new StringBuilder();
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord.append(sb).append(" ");
        }
        return reverseWord.toString().trim();
    }

      public static int sum(int[] arr){
        int total = 0;
        for (int j : arr) {
            if (j >= 0) {
                total += j;
            }
        }
        return arr.length > 0 ? total : 0;
    }

    public static boolean setAlarm(boolean employed,boolean vacation){
        return employed && !vacation;
    }

    public static String numberOfString(int num){
        return String.valueOf(num);

    }

    // "1 sheep...2 sheep...";
    private static String countingSheep(int num) {
       //
        return "";
    }


    public static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
