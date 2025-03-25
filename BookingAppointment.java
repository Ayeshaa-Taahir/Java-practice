import java.util.*;

abstract class Professional {
    protected String name;
    protected String availableTime;
    public Professional(String name, String availableTime) {
        this.name = name;
        this.availableTime = availableTime;
    }
    public abstract void scheduleAppointment(String userName);
}
class Doctor extends Professional {
    public Doctor(String name, String availableTime) {
        super(name, availableTime);
    }
    @Override
    public void scheduleAppointment(String userName) {
        System.out.println("\nAppointment confirmed!");
        System.out.println("Patient: " + userName);
        System.out.println("Doctor: " + name);
        System.out.println("Time: " + availableTime);
    }
}
class Architecture extends Professional {
    public Architecture(String name, String availableTime) {
        super(name, availableTime);
    }

    @Override
    public void scheduleAppointment(String userName) {
        System.out.println("\nAppointment confirmed!");
        System.out.println("Client: " + userName);
        System.out.println("Architecture: " + name);
        System.out.println("Time: " + availableTime);
    }
}
public class BookingAppointment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        String userName = sc.nextLine();
        System.out.print("Choose appointment type (Doctor/Engineer) ");
        String choice = sc.nextLine();
        Professional professional = null;
        if (choice.equalsIgnoreCase("Doctor")) {
            professional = new Doctor("Dr. Ayesha", "10:00 AM - 12:00 PM");
        } else if (choice.equalsIgnoreCase("Architecture")) {
            professional = new Architecture("Architect . Rabbis", "2:00 PM - 4:00 PM");
        } else {
            System.out.println("Invalid choice! Please enter Doctor or Engineer.");
            sc.close();
            return;
        }
        professional.scheduleAppointment(userName);
        sc.close();
    }
}