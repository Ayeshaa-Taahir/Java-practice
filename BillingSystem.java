import java.util.*;

class Item {
    String name;
    double price;
    int quantity;
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return price * quantity;
    }
    @Override
    public String toString() {
        return name + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalPrice();
    }
}
public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> cart = new ArrayList<>();
        double totalBill = 0;
        while (true) {
            System.out.println("1. Add Item\n2. View Bill\n3. Apply Discount\n4. Checkout\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter item name ");
                String name = scanner.nextLine();
                System.out.print("Enter item price ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity ");
                int quantity = scanner.nextInt();

                Item item = new Item(name, price, quantity);
                cart.add(item);
                totalBill += item.getTotalPrice();
                System.out.println("Item added to cart");
            } 
            else if (choice == 2) {
                System.out.println("\nCurrent Bill");
                for (Item item : cart) {
                    System.out.println(item);
                }
                System.out.println("Total: $" + totalBill);
            } 
            else if (choice == 3) {
                System.out.print("Enter discount percentage ");
                double discount = scanner.nextDouble();
                double discountAmount = (totalBill * discount) / 100;
                totalBill -= discountAmount;
                System.out.println("Discount applied! New total: $" + totalBill);
            } 
            else if (choice == 4) {
                System.out.println("Final Bill: $" + totalBill);
                System.out.println("Thank you for shopping");
                cart.clear();
                totalBill = 0;
            } 
            else if (choice == 5) {
                System.out.println("Exiting");
                break;
            } 
            else {
                System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}