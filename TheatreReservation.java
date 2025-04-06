import java.util.Scanner;

class Seat {
    private boolean isBooked;
    private String customerName;
    public Seat() {
        this.isBooked = false;
        this.customerName = "";
    }
    public boolean isBooked() {
        return isBooked;
    }
    public boolean book(String name) {
        if (!isBooked) {
            isBooked = true;
            customerName = name;
            return true;
        }
        return false;
    }
    public String getDisplaySymbol() {
        return isBooked ? "X" : "O"; // X = Booked, O = Available
    }
}

class Theatre {
    private Seat[][] seats;
    private int rows, cols;
    private String movieTitle;
    public Theatre(String movieTitle, int rows, int cols) {
        this.movieTitle = movieTitle;
        this.rows = rows;
        this.cols = cols;
        seats = new Seat[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                seats[i][j] = new Seat();
    }
    public void displaySeats() {
        System.out.println("\nNow Showing: " + movieTitle);
        System.out.println("Seat Layout (O = Available, X = Booked):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j].getDisplaySymbol() + " ");
            }
            System.out.println();
        }
    }
    public boolean bookSeat(int row, int col, String name) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return seats[row][col].book(name);
        }
        return false;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
}
public class TheatreReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Theatre[] theatres = {
            new Theatre("Jumanji", 5, 6),
            new Theatre("Kung Fu Panda", 4, 5),
            new Theatre("The Lego Movie", 6, 6),
            new Theatre("Finding Nemo", 4, 4)
        };
        System.out.println("Available Films:");
        for (int i = 0; i < theatres.length; i++) {
            System.out.println((i + 1) + ". " + theatres[i].getMovieTitle());
        }
        System.out.print("Select a movie (1-" + theatres.length + "): ");
        int selected = sc.nextInt() - 1;
        if (selected < 0 || selected >= theatres.length) {
            System.out.println("Invalid selection.");
            return;
        }
        Theatre selectedTheatre = theatres[selected];
        int choice;
        do {
            System.out.println("\n--- " + selectedTheatre.getMovieTitle() + " Theatre Menu ---");
            System.out.println("1. View Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    selectedTheatre.displaySeats();
                    break;
                case 2:
                    System.out.print("Enter row (0-" + (selectedTheatre.getMovieTitle().equals("Finding Nemo") ? 3 : 4) + "): ");
                    int row = sc.nextInt();
                    System.out.print("Enter column (0-5): ");
                    int col = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    if (selectedTheatre.bookSeat(row, col, name)) {
                        System.out.println("Seat booked successfully for " + name + ".");
                    } else {
                        System.out.println("Seat is already booked or invalid.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the booking system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
        sc.close();
    }
}