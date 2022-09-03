package unit_loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            int randomNumber = ThreadLocalRandom.current().nextInt(1,4);
            System.out.println("Rolled " + randomNumber + ".");
            System.out.println("DO you want to stop y/n");
            again = scanner.next();
        }
        while(!again.equals("y"));

    }
}
