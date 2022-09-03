package unit_three_cond_statements;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Private man club");

        System.out.print("Age: ");
        int age = scanner.nextInt();




        if(age >= 18){
            System.out.print("Do you have a VIP Pass y/n");
            String pass = scanner.next();
            if(pass.equals("y") || age >= 70){
                System.out.println("Thanks go in");
            }
            else {
                System.out.println("Gimme your pass");
            }
        }
        else {
            System.out.println("18+");
        }

//        if( age >= 70 || age >= 18 && pass.equals("y") ){
//            System.out.println("Go in ");
//        } else {
//            System.out.println("No no no");
//        }
    }
}
