import java.util.*;

class Car {
    private String licensePlate;
    private long entryTime;
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.entryTime = System.currentTimeMillis();
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public long getEntryTime() {
        return entryTime;
    }
}
class ParkingLot {
    private int totalSpots;
    private Map<String, Car> parkedCars;
    private final double RATE_PER_HOUR = 30; 

    public ParkingLot(int totalSpots) {
        this.totalSpots = totalSpots;
        this.parkedCars = new HashMap<>();
    }
    public boolean parkCar(String licensePlate) {
        if (parkedCars.size() >= totalSpots) {
            System.out.println("Parking is full!");
            return false;
        }
        parkedCars.put(licensePlate, new Car(licensePlate));
        System.out.println("Car " + licensePlate + " parked.");
        return true;
    }
    public void exitCar(String licensePlate) {
        Car car = parkedCars.remove(licensePlate);
        if (car == null) {
            System.out.println("Car not found!");
            return;
        }
        long parkedTime = System.currentTimeMillis() - car.getEntryTime();
        double hoursParked = parkedTime / (1000.0 * 60 * 60);
        double fee = Math.ceil(hoursParked) * RATE_PER_HOUR;
        System.out.println("Car " + licensePlate + " exited. Parking fee: $" + fee);
    }
    public void displayAvailableSpots() {
        System.out.println("Available spots: " + (totalSpots - parkedCars.size()));
    }
}
public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingLot lot = new ParkingLot(5); 

        while (true) {
            System.out.println("\n1. Park Car\n2. Exit Car\n3. Show Available Spots\n4. Exit");
            System.out.print("Choose an option ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter license plate ");
                    String plate = scanner.nextLine();
                    lot.parkCar(plate);
                    break;
                case 2:
                    System.out.print("Enter license plate ");
                    plate = scanner.nextLine();
                    lot.exitCar(plate);
                    break;
                case 3:
                    lot.displayAvailableSpots();
                    break;
                case 4:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
