package unit_three_cond_statements;

import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println("Entered 1 ");
            case 2 -> System.out.println("Entered 2 ");
            default -> System.out.println("Invalid number");
        }

    }
}
