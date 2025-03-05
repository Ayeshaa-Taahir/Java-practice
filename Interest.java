import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;
        System.out.println("\nSimple Interest: $" + interest);
        System.out.println("Total Amount to be Paid: $" + totalAmount);

        scanner.close();
    }
}