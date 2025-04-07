import java.util.*;

abstract class Pet {
    protected String name;
    protected String type;
    protected String personality;
    protected boolean isAdopted;
    public Pet(String name, String type, String personality) {
        this.name = name;
        this.type = type;
        this.personality = personality;
        this.isAdopted = false;
    }
    public boolean adopt() {
        if (!isAdopted) {
            isAdopted = true;
            return true;
        }
        return false;
    }
    public boolean isAvailable() {
        return !isAdopted;
    }
    public void display() {
        System.out.println(name + " (" + type + ") - " + personality + (isAdopted ? " [Adopted]" : ""));
    }
}
class Dog extends Pet {
    public Dog(String name) {
        super(name, "Dog", "Loyal and playful");
    }
}
class Cat extends Pet {
    public Cat(String name) {
        super(name, "Cat", "Independent and curious");
    }
}
class Bunny extends Pet {
    public Bunny(String name) {
        super(name, "Bunny", "Soft and cuddly");
    }
}
class AdoptionCenter {
    private List<Pet> pets = new ArrayList<>();
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    public void displayAvailablePets() {
        boolean anyAvailable = false;
        for (Pet pet : pets) {
            if (pet.isAvailable()) {
                pet.display();
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No pets available at the moment.");
        }
    }
    public boolean adoptPet(String petName) {
        for (Pet pet : pets) {
            if (pet.name.equalsIgnoreCase(petName) && pet.isAvailable()) {
                return pet.adopt();
            }
        }
        return false;
    }
}
public class PetAdoption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdoptionCenter center = new AdoptionCenter();
        center.addPet(new Dog("Buddy"));
        center.addPet(new Cat("Whiskers"));
        center.addPet(new Bunny("Coco"));
        center.addPet(new Dog("Max"));
        center.addPet(new Cat("Luna"));
        int choice;
        do {
            System.out.println("\n--- Pet Adoption Center ---");
            System.out.println("1. View Available Pets");
            System.out.println("2. Adopt a Pet");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    center.displayAvailablePets();
                    break;
                case 2:
                    System.out.print("Enter the name of the pet you want to adopt: ");
                    String petName = sc.nextLine();
                    if (center.adoptPet(petName)) {
                        System.out.println("Congratulations! You adopted " + petName + ".");
                    } else {
                        System.out.println("Sorry, that pet is either not found or already adopted.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for visiting the adoption center.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
        sc.close();
    }
}