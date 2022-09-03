package unit_three_cond_statements;

import java.util.Scanner;

public class LexicalScope {
    public static void main(String[] args) {

        double btc;
        if(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bitcoin count ? ");
            btc = scanner.nextDouble();
        }
        System.out.println("You have : " + btc);

    }
}
