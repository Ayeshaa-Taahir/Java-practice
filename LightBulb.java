import java.util.*;

class Bulb {
    private boolean isOn = false;
    void turnOn() {
        isOn = true;
        System.out.println("The bulb is turned ON.");
    }
    void turnOff() {
        isOn = false;
        System.out.println("The bulb is turned OFF.");
    }
    void checkStatus() {
        if (isOn) {
            System.out.println("The bulb is ON.");
        } else {
            System.out.println("The bulb is OFF.");
        }
    }
}
public class LightBulb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bulb b = new Bulb();
        int choice;
        do {
            System.out.println("1. Turn ON the Light");
            System.out.println("2. Turn OFF the Light");
            System.out.println("3. Check the Light Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    b.turnOn();
                    break;
                case 2:
                    b.turnOff();
                    break;
                case 3:
                    b.checkStatus();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        scan.close(); 
    }
}