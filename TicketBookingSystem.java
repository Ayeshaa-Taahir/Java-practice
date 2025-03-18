import java.util.Scanner;

class Bus {
    private int totalSeats;
    private int bookedSeats;

    public Bus(int seats) {
        this.totalSeats = seats;
        this.bookedSeats = 0;
    }
    public void bookTicket(int seats) {
        if (bookedSeats + seats > totalSeats) {
            System.out.println("Not enough seats available");
        } else {
            bookedSeats += seats;
            System.out.println(+ seats + " ticket booked successfully");
        }
    }
    public void availableSeats() {
        System.out.println(" Available seats: " + (totalSeats - bookedSeats));
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bus bus = new Bus(10); 
        while (true) {
            System.out.println("\n1. Book Ticket\n2. Check Availability\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets: ");
                    int tickets = scanner.nextInt();
                    bus.bookTicket(tickets);
                    break;
                case 2:
                    bus.availableSeats();
                    break;
                case 3:
                    System.out.println("Have a safe journey!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}