package unit_tik_tak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] positions = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter position");
        input = sc.nextInt();
        positions[input - 1] = 'X';

        System.out.println(" " + positions[6] + " | " + positions[7] + " | " + positions[8]);
        System.out.println("---+---+---");
        System.out.println(" " + positions[3] + " | " + positions[4] + " | " + positions[5]);
        System.out.println("---+---+---");
        System.out.println(" " + positions[0] + " | " + positions[1] + " | " + positions[2]);
    }
}


//  7 |  8  | 9
// -----------
//  4 |  5  | 6
// -----------
//  1 |  2  | 3