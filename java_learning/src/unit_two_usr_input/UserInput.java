package unit_two_usr_input;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("What is your name");
        String answer = scanner.next();

        System.out.println("How tall are you " + answer);
        int answer2 = scanner.nextInt();
        System.out.println("Bank account bitch");
        double answer3 = scanner.nextDouble();
        System.out.print("Your are " + answer + " and tall you are " + answer2 + " Your Bank account " + answer3);

        double avgMale = answer3 - 1.77;
        double avgFemale = answer3 - 1.60;

        System.out.format("Best male  %.2f" ,avgMale);
        System.out.format("Best female %.2f ",avgFemale);*/


        System.out.print("Total bill in $ : ");
        double money = scanner.nextDouble();

        System.out.print("Head count ? ");
        int ppl = scanner.nextInt();


        System.out.println();

        double eachPay = money / ppl;

        System.out.println(" Each pay " + eachPay);





    }
}
