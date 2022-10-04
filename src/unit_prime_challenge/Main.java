package unit_prime_challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the maximum possible score for this exam: ");
//        int maxScore = scanner.nextInt();
//        System.out.println("How many student took the test ? ");
//        int input = scanner.nextInt();
//
//        double[] scores = new double[input];
//
//        System.out.println("\nEnter each student's score.");
//        for (int i = 0; i < scores.length; i++) {
//            System.out.print("Student " + (i + 1) + ": ");
//            scores[i] = scanner.nextInt();
//        }
//
//        System.out.println("\n--- Statistics ---");
//
//        int sum = 0;
//        for (int i = 0; i < scores.length; i++) {
//            double studentScore = scores[i];
//            double studentPercentage = (scores[i] / maxScore) * 100;
//            System.out.println("Student " + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPercentage + "%)");
//            sum += studentScore;
//        }
//
//        double mean = (double)sum / scores.length;
//        double meanPercentage = (mean / maxScore) * 100;
//        System.out.println("Average: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");
        String[] questions = new String[] {"Is Dog a animal ? ","Are you human ? ", "Is programming easy ? ","Is sky blue ? ","Does somebody cares ?"};
        boolean[] correctAnswers = new boolean[] {true,false,false,true,false};
        boolean[] userAnswers = new boolean[5];

        int finalScore = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("\nQuestion " + (i+1) + ": " + questions[i] + ". True or False?");
            System.out.print("Your answer: ");
            userAnswers[i] = scanner.nextBoolean();

            if (userAnswers[i] == correctAnswers[i]) {
                System.out.println("Correct!");
                finalScore++;
            }
            else {
                System.out.println("Wrong. It's " + correctAnswers[i] + ".");
            }

        }

        System.out.println("\nYour final score is " + finalScore + " out of 5.");

    }
}
