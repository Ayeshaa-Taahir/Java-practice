import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println(" Welcome to the Quick Quiz ");
        System.out.println("\n1. What is the capital of Pakistan?");
        System.out.println("   a) Rawalpindi  b) Karachi  c) Lahore  d) Islamabad");
        if (scan.next().equalsIgnoreCase("c")) score++;

        System.out.println("\n2. Who wrote 'Hamlet'?");
        System.out.println("   a) Charles Dickens  b) William Shakespeare  c) Mark Twain  d) J.K. Rowling");
        if (scan.next().equalsIgnoreCase("b")) score++;

        System.out.println("\n3. What is 5 * 6?");
        System.out.println("   a) 30  b) 25  c) 35  d) 40");
        if (scan.next().equalsIgnoreCase("a")) score++;

        System.out.println("\n Quiz Over! Your Score: " + score + "/3");

        if (score == 3) System.out.println("Excellent!");
        else if (score == 2) System.out.println("Good Job");
        else System.out.println("Better Luck Next Time");
    }
}