package unit_three_cond_statements;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number from 1 - 4");
        int userInput = scanner.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);

        System.out.println("Number is " + randomNumber);
        // if number > 3 -- incorrect input
        // if number == guessed -- lucky bastard
        // if number != guessed -- try next time
        if(userInput > 3){
            System.out.println("Must be in range 1 - 3 ");
        } else if (userInput == randomNumber) {
            System.out.println("Lucky you ");
        }else {
            System.out.println("Sorry boo");
        }
//        int x = 30;
//        int y = 30;
//
//        if(x > y){
//            System.out.println("X is bigger than y more then " + (x - y));
//        } else if(x < y ){
//            System.out.println("X is smaller then y smaller num" + (y - x));
//
//        } else {
//            System.out.println("Equal");
//
//        }




    }
}
