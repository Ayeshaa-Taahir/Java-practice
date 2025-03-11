import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Caesar Cipher!");
        System.out.println("1. Encrypt a message");
        System.out.println("2. Decrypt a message");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1 || choice == 2) {
            System.out.print("Enter message: ");
            String message = scanner.nextLine();
            System.out.print("Enter shift (1-25): ");
            int shift = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Encrypted: " + shiftMessage(message, shift));
            } else {
                System.out.println("Decrypted: " + shiftMessage(message, 26 - shift));
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
    public static String shiftMessage(String message, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                result.append((char) (base + (ch - base + shift) % 26));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}