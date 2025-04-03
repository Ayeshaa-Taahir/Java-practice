import java.util.Scanner;

class CafeteriaManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menuItems = {"Biryani", "Tikka", "Pasta", "Ice Latte", "Pzza"};
        double[] prices = {5.99, 8.99, 6.49, 3.49, 2.99};
        int[] quantity = new int[menuItems.length];
        System.out.println("Welcome to Ayesha's Cafe");
        System.out.println("Here's our menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - $" + prices[i]);
        }
        while (true) {
            System.out.print("Enter item number to order (0 to finish) ");
            int choice = scanner.nextInt();        
            if (choice == 0) break;
            if (choice < 1 || choice > menuItems.length) {
                System.out.println("Invalid choice");
                continue;
            }       
            System.out.print("Enter quantity ");
            int qty = scanner.nextInt();
            quantity[choice - 1] += qty;
        }
        double total = 0;
        System.out.println("\nYour Order Summary:");
        for (int i = 0; i < menuItems.length; i++) {
            if (quantity[i] > 0) {
                double itemTotal = quantity[i] * prices[i];
                total += itemTotal;
                System.out.println(menuItems[i] + " x " + quantity[i] + " = $" + itemTotal);
            }
        }
        if (total > 20) {
            System.out.println("\nCongratulations! You get a 10% discount.");
            total *= 0.90;
        }
        System.out.println("Total Bill: $" + total);
        System.out.print("Choose Payment Method (Cash / Card): ");
        String payment = scanner.next();
        System.out.println("Payment successful using " + payment + ". Enjoy your meal!");
        scanner.close();
    }
}