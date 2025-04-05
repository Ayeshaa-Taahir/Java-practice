abstract class Product {
    private String name;
    private double priceUSD;
    public Product(String name, double priceUSD) {
        this.name = name;
        this.priceUSD = priceUSD;
    }
    public String getName() {
        return name;
    }
    public double getPricePKR() {
        return priceUSD * 280;
    }
    public abstract void displayDetails();
}
class Electronics extends Product {
    private String brand;
    public Electronics(String name, double priceUSD, String brand) {
        super(name, priceUSD);
        this.brand = brand;
    }
    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + " | Price: PKR " + getPricePKR() + " | Brand: " + brand);
    }
}
class Clothing extends Product {
    private String size;

    public Clothing(String name, double priceUSD, String size) {
        super(name, priceUSD);
        this.size = size;
    }
    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + getName() + " | Price: PKR " + getPricePKR() + " | Size: " + size);
    }
}
public class ShoppingSystem {
    public static void main(String[] args) {
        Product p1 = new Electronics("Smartphone", 5999.99, "Samsung");
        Product p2 = new Clothing("T-Shirt", 219.99, "L");
        Product p3 = new Clothing("Handbag", 495.99, "One Size");
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}