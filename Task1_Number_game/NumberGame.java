package org.example;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("===== NUMBER GUESSING GAME =====");

        while (playAgain) {

            int number = random.nextInt(100) + 1;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {

                System.out.print("\nAttempt " + attempt + " - Enter your guess: ");
                int guess = sc.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    attempt--;
                    continue;
                }

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    int roundScore = maxAttempts - attempt + 1;
                    totalScore += roundScore;

                    System.out.println("Round Score: " + roundScore);
                    guessedCorrectly = true;
                    break;
                }
                else if (guess > number) {
                    System.out.println("Too high! Try a smaller number.");
                }
                else {
                    System.out.println("Too low! Try a bigger number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("\nGame Over! The correct number was: " + number);
            }

            System.out.println("Total Score: " + totalScore);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {

                playAgain = false;
            }
        }

        System.out.println("\nThank you for playing!");
        sc.close();
    }
}
