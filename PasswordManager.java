import java.util.Scanner;

class PM {
    private String password;
    PM(String password) {
        this.password = password;
    }
    void change(String old, String newPass) {
        if (old.equals(password)) { 
            password = newPass;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Incorrect old password");
        }
    }
    void validatePass(String input) {
        if (password.equals(input)) { 
            System.out.println("Password is correct");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
public class PasswordManager {
    public static void main(String[] args) {
        PM pm = new PM("EyeeeeShah"); 
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Change Password");
            System.out.println("2. Validate Password");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter old password: ");
                    String oldPass = scan.nextLine();
                    System.out.print("Enter new password: ");
                    String newPass = scan.nextLine();
                    pm.change(oldPass, newPass);
                    break;
                case 2:
                    System.out.print("Enter password to validate: ");
                    String inputPass = scan.nextLine();
                    pm.validatePass(inputPass);
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}