package unit_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        char[] charArr = {'h','e','l','l','o',' ','w','o','r','l','d','!'};
//        System.out.print(String.valueOf(charArr));
        // String test = highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        //boolean result = isPrime(0);
        //betterThenAverage(new int[] {2, 3}, 5);
       // int test = remove(3);
        var result = areYouPlaying("Martin");
        System.out.print(result);
    }

    public static String areYouPlaying(String name){
        for (int i = 0; i < 1; i++) {
            char fL = name.charAt(i);
            if(name.charAt(i) == 'R'){
              return name + "plays";
            }
        }
        return name + "Not";
    }


    public static boolean betterThenAverage(int[] avgPoints,int yourPoint){
        int i,total;
        int n = 5;
        total = 0;
        for(i=0; i< avgPoints.length; i++) {
            total += avgPoints[i];
        }
        System.out.println("Average ::"+ total/(float)n);

        avgPoints  = Arrays.copyOf(avgPoints, avgPoints.length + 1);
        avgPoints[avgPoints.length - 1] = yourPoint;
        for(i=0; i< avgPoints.length; i++) {
            total += avgPoints[i];
        }
        System.out.print(total/(float)n);

        return true;
    }

    public static boolean isPrime(int num){


        boolean isPrime = true;

        int i,m=0,flag=0;
        m=num/2;
        if(num==0||num==1){
            isPrime = false;
        }else{
            for(i=2;i<=m;i++){
                if(num%i==0){
                    flag=1;
                    isPrime = false;
                    break;
                }
            }
            if(flag == 0){
                isPrime = true;
            }
        }


        return isPrime;

      //  boolean isPrime = true;

//        if(num <= 0 || num == 1){
//            isPrime = false;
//        }
//        if(num % 2 == 0){
//            isPrime = false;
//        }
//
//        if(num == 0 || num < 0){
//            isPrime = false;
//        }
//        for (int div = 2; div < num; div++) {
//            if(num % div == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
    }

    public static String highAndLow(String value) {
        String[] s = value.split(" ");
        int[] out = new int[s.length];

        for(int i = 0 ; i < s.length ; i++){
            out[i] = Integer.parseInt(s[i]);
        }

        int maxNum = out[0];
        for (int j : out) {
            if (j > maxNum)
                maxNum = j;
        }
        int minNum = out[0];

        for (int j : out) {
            if (j < minNum)
                minNum = j;
        }

        return maxNum + " " + minNum;

    }






}
