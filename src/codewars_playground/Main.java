package codewars_playground;

import unit_arrays.Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        int result =  sum(new int[] {});
          // System.out.print(result);
      //  String result = countingSheep(1);
             var inte =min(new int[]{3,-7});
             int resultanto =  points(new String[]
                     {"1:1","2:2","3:5","4:4","2:2","3:3","4:4","3:3","4:4","4:4"});
        System.out.print(resultanto); // must be equal 30;
    }
    public static String camelCase(String str) {
        // your code here
    }

    public static int min(int[] list) {
        return Arrays.stream(list).min().orElse(0);
      // return Integer.parseInt(String.valueOf(Arrays.stream(list).max()));
    }
    public static int points(String[] games) {
        // x our score , y opponent

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
