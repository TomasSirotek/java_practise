package unit_loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String again;
//
//        do {
//            int randomNumber = ThreadLocalRandom.current().nextInt(1,4);
//            System.out.println("Rolled " + randomNumber + ".");
//            System.out.println("DO you want to stop y/n");
//            again = scanner.next();
//        }
//        while(!again.equals("y"));
        // TODO: Make user to input compare to the email and password if not right make him do it again if it reaches 3x blocked out

        Scanner scanner = new Scanner(System.in);
        String userName = "tomas";
        String userNameInput;
        int passwordInput;
        int password = 123456;
        int tries = 0;
        int allowedTries = 3;

        do {
           System.out.println("Enter your userName");
           userNameInput = scanner.next();
           System.out.println("Enter password");
           passwordInput = scanner.nextInt();

           if(!userNameInput.equals(userName) || passwordInput != password ){
               System.out.println("UserName or password is incorrect");
               tries++;
           }
           if(tries >= allowedTries){
               System.out.println("You have been blocked");
               break;
           }
           if(userNameInput.equals(userName) && passwordInput == password){
               System.out.println("Logged in ");
           }
        }
        while(!userNameInput.equals(userName) || passwordInput != password);


    }
}
