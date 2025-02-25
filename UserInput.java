/*
    User Input
    Java has a Scanner Class to read data from the keyboard
    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    System.in-----> Read from the keyboard
    sc -----> obj of Scanner class
*/
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
      System.out.println("Enter your age");  
      Scanner student = new Scanner(System.in);
      int age = student.nextInt();
      System.out.println("your age is");
      System.out.println(age);

    }
}
