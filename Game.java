import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner for user input

        System.out.println("Welcome to the Text Adventure Game");
        System.out.println("You wake up in a mysterious forest, The path splits into two different directions");
        System.out.println("1. Go left towards the dark cave");
        System.out.println("2. Go right towards the sparkling river");

        int choice = scanner.nextInt(); 

        if (choice == 1) {
            System.out.println("You enter the dark cave");
            System.out.println("You see a glowing treasure chest and a sleeping dragon");
            System.out.println("1. Try to open the treasure chest");
            System.out.println("2. Sneak past the dragon");

            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("The dragon wakes up and breathes fire! Game Over");
            } else if (choice == 2) {
                System.out.println("You successfully sneak past the dragon and find a hidden exit, Hurray!You win");
            } else {
                System.out.println("Invalid choice");
            }
        } else if (choice == 2) {
            System.out.println("You approach the sparkling river");
            System.out.println("You see a boat and a bridge");
            System.out.println("1. Take the boat");
            System.out.println("2. Cross the bridge");

            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("The boat takes you to a hidden island full of treasure , Hurray!You win");
            } else if (choice == 2) {
                System.out.println("The bridge collapses, and you fall into the river");
            } else {
                System.out.println("Invalid choice");
            }
        } else {
            System.out.println("Invalid choice, Game Over");
        }
    }
}