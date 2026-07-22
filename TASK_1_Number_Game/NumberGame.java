import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int roundsWon = 0;

        boolean playAgain = true;

        while (playAgain) {

            int number = random.nextInt(100) + 1;

            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\n=================================");
            System.out.println("      NUMBER GUESSING GAME");
            System.out.println("=================================");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {

                System.out.print("Attempt " + attempt + ": ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");

                    guessed = true;
                    roundsWon++;

                    int score = (maxAttempts - attempt + 1) * 10;
                    totalScore += score;

                    System.out.println("Score this round: " + score);

                    break;

                } else if (guess < number) {
                    System.out.println("Too Low!");

                } else {
                    System.out.println("Too High!");
                }
            }

            if (!guessed) {
                System.out.println("You Lost!");
                System.out.println("Correct Number was: " + number);
            }

            System.out.println("\nRounds Won : " + roundsWon);
            System.out.println("Total Score: " + totalScore);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = sc.next();

            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("\n=================================");
        System.out.println("Thanks for Playing!");
        System.out.println("Rounds Won : " + roundsWon);
        System.out.println("Final Score: " + totalScore);
        System.out.println("=================================");

        sc.close();
    }
}