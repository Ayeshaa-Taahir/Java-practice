import java.util.*;

class Manage {
    private String Title;
    private String Author;
    private Boolean Book;

    Manage(String title, String author) {
        this.Title = title;
        this.Author = author;
        this.Book = false; 
    }
    void issue() {
        if (!Book) {
            System.out.println(Title + " is issued.");
            Book = true;
        } else {
            System.out.println(Title + " is already issued.");
        }
    }
    void returnBook() {
        if (Book) {
            System.out.println(Title + " is returned.");
            Book = false;
        } else {
            System.out.println(Title + " was not issued.");
        }
    }
    void show() {
        if (Book) {
            System.out.println(Title + " is currently issued.");
        } else {
            System.out.println(Title + " is available.");
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        Manage mg = new Manage("The Kite Runner", "Khaled Hosseini");

        do {
            System.out.println("1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Show Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    mg.issue();
                    break;
                case 2:
                    mg.returnBook();
                    break;
                case 3:
                    mg.show();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}