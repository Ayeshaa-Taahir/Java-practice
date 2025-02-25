import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        Scanner invite = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = invite.nextLine();
        System.out.println("Hello " + name + " Welcome to my Java repository");
    }
}
