import java.util.Scanner;

public class ToCheckTypingSpeed {
    public static void main(String[] args) {
        String sentence = "Ayesha is the most beautiful girl in the whole world";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the following sentence as fast as you can:");
        System.out.println("\"" + sentence + "\"");
        System.out.println("Press Enter when you are ready...");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();
        System.out.print("Start typing: ");
        String userInput = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        if (!userInput.equals(sentence)) {
            System.out.println(" The text doesn't match exactly");
        } else {
            long timeTaken = (endTime - startTime) / 1000;
            int words = sentence.split(" ").length;
            double speed = (double) words / timeTaken * 60;
            System.out.println("Well done! Your typing speed is: " + speed + " words per minute");
        }

        scanner.close();
    }
}