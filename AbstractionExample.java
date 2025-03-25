abstract class Animal {
    abstract void makeSound();  // Abstract method (no implementation)
    public void sleep() {  // Non-abstract method
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  // Implementation in Dog class
        myDog.sleep();      // Inherited method from Animal
    }
}