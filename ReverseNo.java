import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            num /= 10; // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}