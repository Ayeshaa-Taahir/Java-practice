import java.util.*;

class Car {
    private String ownerName;
    private String carType;
    private String color;
    private int dirtLevel; // 1 to 10
    public Car(String ownerName, String carType, String color, int dirtLevel) {
        this.ownerName = ownerName;
        this.carType = carType;
        this.color = color;
        this.dirtLevel = dirtLevel;
    }
    public void wash(String washType) {
        switch (washType.toLowerCase()) {
            case "basic":
                dirtLevel = Math.max(0, dirtLevel - 3);
                break;
            case "deluxe":
                dirtLevel = Math.max(0, dirtLevel - 6);
                break;
            case "sparkle":
                dirtLevel = 0;
                break;
            default:
                System.out.println("Invalid wash type");
                return;
        }
        System.out.println(carType + " owned by " + ownerName + " is now cleaned to level " + dirtLevel);
    }
    public void displayStatus() {
        System.out.println(ownerName + "'s " + color + " " + carType + " | Dirt Level: " + dirtLevel);
    }
    public boolean isClean() {
        return dirtLevel == 0;
    }
}
class CarWashCenter {
    private List<Car> carQueue = new ArrayList<>();
    public void addCar(Car car) {
        carQueue.add(car);
        System.out.println("Car added to wash queue");
    }
    public void startWashing() {
        if (carQueue.isEmpty()) {
            System.out.println("No cars in queue");
            return;
        }
        Scanner sc = new Scanner(System.in);
        for (Car car : carQueue) {
            System.out.println("\nWashing car:");
            car.displayStatus();
            if (car.isClean()) {
                System.out.println("This car is already clean!");
                continue;
            }
            System.out.print("Choose wash type (Basic / Deluxe / Sparkle) ");
            String washType = sc.nextLine();
            car.wash(washType);
        }
        carQueue.clear();
        System.out.println("\nAll cars have been washed");
    }
    public void viewQueue() {
        if (carQueue.isEmpty()) {
            System.out.println("No cars currently in the queue.");
        } else {
            for (Car car : carQueue) {
                car.displayStatus();
            }
        }
    }
}
public class CarWashSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarWashCenter center = new CarWashCenter();

        int choice;
        do {
            System.out.println("\n--- Car Wash Simulator ---");
            System.out.println("1. Add Car to Queue");
            System.out.println("2. View Cars in Queue");
            System.out.println("3. Start Washing");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Owner name ");
                    String owner = sc.nextLine();
                    System.out.print("Car type (e.g. Jeep, Sports Car) ");
                    String type = sc.nextLine();
                    System.out.print("Color");
                    String color = sc.nextLine();
                    System.out.print("Dirt level (1-10) ");
                    int dirt = sc.nextInt(); sc.nextLine();
                    Car car = new Car(owner, type, color, dirt);
                    center.addCar(car);
                    break;
                case 2:
                    center.viewQueue();
                    break;
                case 3:
                    center.startWashing();
                    break;
                case 4:
                    System.out.println("Thanks for using the Car Wash Simulator!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}