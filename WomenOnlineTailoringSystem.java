import java.util.Scanner;

class Measurement {
    private double height;
    private double chest;
    private double waist;
    public Measurement(double height, double chest, double waist) {
        this.height = height;
        this.chest = chest;
        this.waist = waist;
    }
    public double getHeight() {
        return height;
    }
    public double getChest() {
        return chest;
    }
    public double getWaist() {
        return waist;
    }
    public void displayMeasurements() {
        System.out.println("Measurements:");
        System.out.println("Height: " + height + " cm");
        System.out.println("Chest: " + chest + " cm");
        System.out.println("Waist: " + waist + " cm");
    }
}
class WomenTailor {
    protected Measurement measurement; 
    public WomenTailor(Measurement measurement) {
        this.measurement = measurement;
    }
    public void chooseDesign(String designName) {
        System.out.println("Design selected: " + designName);
    }
    public void chooseDesign(String designCategory, String color) {
        System.out.println("Category: " + designCategory + ", Color: " + color);
    }
    public double calculateFabricRequired() {
        return measurement.getHeight() * 0.7 + measurement.getWaist() * 0.3;
    }
    public void displayOrderSummary() {
        measurement.displayMeasurements();
        System.out.println("Estimated Fabric Required: " + calculateFabricRequired() + " meters");
    }
}
public class WomenOnlineTailoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height (cm): ");
        double height = scanner.nextDouble();
        System.out.print("Enter chest size (cm): ");
        double chest = scanner.nextDouble();
        System.out.print("Enter waist size (cm): ");
        double waist = scanner.nextDouble();
        Measurement userMeasurement = new Measurement(height, chest, waist);
        WomenTailor tailor = new WomenTailor(userMeasurement);
        System.out.print("Enter design name: ");
        String designName = scanner.next();
        tailor.chooseDesign(designName);
        System.out.println("\n--- Order Summary ---");
        tailor.displayOrderSummary();
    }
}