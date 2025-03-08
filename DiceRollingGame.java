import java.util.Random;
import java.util.Scanner;

public class DiceRollingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Welcome to the Dice Rolling Game");
        while (true) {
            System.out.print("\nPress 'r' to roll the dice or 'q' to quit ");
            char choice = scan.next().charAt(0);      
            if (choice == 'r' || choice == 'R') {
                int diceRoll = rand.nextInt(6) + 1;
                System.out.println("You rolled a: " + diceRoll);
            } 
            else if (choice == 'q' || choice == 'Q') {
                System.out.println("Exiting");
                break;
            } 
            else {
                System.out.println("Invalid choice");
            }
        }
    }
}