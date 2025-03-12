import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int num;
    boolean booked;

    Room(int num) {
        this.num = num;
        this.booked = false;
    }
    void book() {
        if (!booked) {
            booked = true;
            System.out.println("Room " + num + " booked.");
        } else {
            System.out.println("Room " + num + " is already booked.");
        }
    }
    void cancel() {
        if (booked) {
            booked = false;
            System.out.println("Booking for Room " + num + " canceled.");
        } else {
            System.out.println("Room " + num + " is not booked.");
        }
    }
    void status() {
        System.out.println("Room " + num + " - " + (booked ? "Booked" : "Available"));
    }
}
public class HotelManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>();
        for (int i = 1; i <= 5; i++) rooms.add(new Room(i));
        while (true) {
            System.out.println("1. Book Room  2. Cancel Booking  3. Check Status  4. Exit");
            int choice = input.nextInt();
            if (choice == 4) break;
            System.out.print("Enter room number (1-5): ");
            int num = input.nextInt();
            if (num < 1 || num > 5) {
                System.out.println("Invalid room number.");
                continue;
            }
            Room room = rooms.get(num - 1);
            if (choice == 1) room.book();
            else if (choice == 2) room.cancel();
            else if (choice == 3) room.status();
            else System.out.println("Invalid choice.");
        }
        System.out.println("Thank you!");
        input.close();
    }
}