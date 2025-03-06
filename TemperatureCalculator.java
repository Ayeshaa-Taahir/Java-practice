import java.util.Scanner;

class Temp {
    private float temp;

    void setCelsius(float value) { temp = value; System.out.println("Stored " + value + "°C."); }
    void setFahrenheit(float value) { temp = value; System.out.println("Stored " + value + "°F."); }
    void toFahrenheit(float value) { System.out.println(value + "°C = " + ((value * 9.0f / 5.0f) + 32) + "°F"); }
    void toCelsius(float value) { System.out.println(value + "°F = " + ((value - 32) * 5.0f / 9.0f) + "°C"); }
    void show() { System.out.println("Stored temperature: " + temp); }
}

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Temp tempObj = new Temp();
        int choice;

        do {
            System.out.println("1. Store Celsius  2. Store Fahrenheit  3. C to F  4. F to C  5. Show  6. Exit");
            choice = scan.nextInt();
            if (choice == 1) tempObj.setCelsius(scan.nextFloat());
            else if (choice == 2) tempObj.setFahrenheit(scan.nextFloat());
            else if (choice == 3) tempObj.toFahrenheit(scan.nextFloat());
            else if (choice == 4) tempObj.toCelsius(scan.nextFloat());
            else if (choice == 5) tempObj.show();
        } while (choice != 6);
    }
}