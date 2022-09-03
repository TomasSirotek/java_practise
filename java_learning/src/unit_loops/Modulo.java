package unit_loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Modulo {
    public static void main(String[] args) {
        // Remainder
        // 15/5 = 0 cuz no remainder (== to 0 true)
        // 16/5 = 1 (!= 0 false)
         System.out.println(15 % 5);


        // int i = ThreadLocalRandom.current().nextInt(89,118);
//
//        // TODO: Print number from 89 to 117
        for (int i = 89; i < 118; i++) {
            System.out.println(i);
        }
//
//        // TODO: Print number from 1 to 40 - every third number print Quack
        int count = 1;

        for (int i = 1; i <= 40; i++) {

            System.out.println(i);

            if (count == 3) {
                System.out.println("Quack");
                count = 0;
            }
            count++;
        }

        // TODO : Write a program which asks the user for a password.
        //  Make the password “shark50”. Each time the user enters the password incorrectly,
        //  prompt them for a password again.
        //  When the user enters the password correctly, print “ACCESS APPROVED”.

        Scanner scanner = new Scanner(System.in);
        String password = "shark50";
        String userInput;

        do {
            System.out.println("What is your password ? :");
            userInput = scanner.next();
        }
        while(!userInput.equals(password));
        System.out.println("Access granted");


        // TODO: Write a program which makes use of a loop to print the following output:
        //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        // TODO: Create a game where the program picks a random number from 1 to 100 and the player has to guess it.
        //  Each time the player makes a guess, print “HIGHER” if the guess was too low or “LOWER” if the guess was too high.
        //  If the player correctly guesses the number, print “CORRECT”, then end the game
        //  You can use the line of code below which produces a random number from 1 to 100, and stores it in randomNumber.

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int input;
        int guessCount = 0;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Guess the number ");

        do {
            input = scanner2.nextInt();
            guessCount++;
            if(input > randomNumber){
                System.out.println("Go lower ");
            }
            else if(input < randomNumber){
                System.out.println("Go higher");
            } else {
                System.out.println("You made it !!! ");
                System.out.println("The number was " + randomNumber + " and you guessed it in tries => " + guessCount );
            }

        }
        while(input != randomNumber);



    }
}
