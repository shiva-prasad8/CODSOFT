package numberGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int round = 1;
        int score = 0;

        System.out.println("Number Game!");

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1; 
            int attempts = 0;
            boolean isCorrect = false;
            
            System.out.println("------------------------------------------------------");
            System.out.println("\nRound " + round + ":");
            System.out.println("I have generated a number between 1 and 100. Can you guess it?");
            System.out.println("You have 10 attempts to guess the correct number.");

            while (attempts < 10 && !isCorrect) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    score += attempts;
                    isCorrect = true;
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!isCorrect) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber);
            }

            System.out.println("Your score for this round is: " + ((isCorrect) ? (attempts) : 0));
            System.out.println("Your total score is: " + score);

            System.out.print("Would you like to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

            round++;
        }

        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }
}
