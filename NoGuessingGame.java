import java.util.Scanner;
import java.util.Random;

public class NoGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; 
        int attempts = 0;
        boolean hasGuessed = false; 
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (!hasGuessed) {
            System.out.print("Enter your guess ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                hasGuessed = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again");
            } else {
                System.out.println("Too high! Try again");
            }
        }
    }
}