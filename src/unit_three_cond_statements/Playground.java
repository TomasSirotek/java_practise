package unit_three_cond_statements;

import java.util.Scanner;

public class Playground {
    /*
        == equal to
        != not equal to 
        > grater then
        >= grater than or equal
        < less than
        <= less than or equal to
     */
    public static void main(String[] args) {

        int requiredHeight = 150;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wasup");
        System.out.print("Please enter your height");
        int height = scanner.nextInt();

        if(height > requiredHeight && height < 210) {
            System.out.println("U shall pass");
        }
        else {
            System.out.println("U not pass");
        }



//        boolean response = true;
//        if(!response){
//            System.out.print("is is false");
//        }
//        System.out.print("Jedeme dale ");
    }
}
