class Vehicle {  // Parent class
    String brand = "Toyota"; 
    public void honk() {
        System.out.println("Beep! Beep!");
    }
}
class Car extends Vehicle { // Child class
    String model = "Corolla"; 
    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
        myCar.honk();  // Using inherited method
    }
}