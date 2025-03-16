import java.util.Random;
import java.util.Scanner;

public class MagicalRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] responses = {
            "Yes, definitely!", "It is certain.", "Without a doubt.",
            "Most likely.", "Outlook good.", "Yes!",
            "Reply hazy, try again.", "Ask again later.", "Better not tell you now.",
            "Don't count on it.", "My reply is no.", "Outlook not so good.", "Very doubtful."
        };
        System.out.println(" Welcome to the Magical Room!");
        while (true) {
            System.out.print("\nAsk a Yes/No question  ");
            String question = scanner.nextLine().trim();

            if (question.equalsIgnoreCase("exit")) {
                System.out.println("👋 Goodbye! May luck be in your favor!");
                break;
            }
            int index = random.nextInt(responses.length);
            System.out.println("🔮 The Magic 8-Ball says: " + responses[index]);
        }
    }
}