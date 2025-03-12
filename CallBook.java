import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name, phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void show() {
        System.out.println(name + " - " + phone);
    }
}

public class CallBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Contact  2. View Contacts  3. Search Contact  4. Exit");
            int choice = input.nextInt();
            input.nextLine();  

            if (choice == 4) break;
            switch (choice) {
                case 1:
                    System.out.print("Enter Name ");
                    String name = input.nextLine();
                    System.out.print("Enter Phone ");
                    String phone = input.nextLine();
                    contacts.add(new Contact(name, phone));
                    System.out.println("Contact added");
                    break;
                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts saved");
                    } else {
                        for (Contact c : contacts) c.show();
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search ");
                    String search = input.nextLine();
                    boolean found = false;
                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(search)) {
                            c.show();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Contact not found");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}