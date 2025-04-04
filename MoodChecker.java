import java.util.Scanner;

public class MoodChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mood Checker");
        System.out.println("----------------------------------");
        System.out.print("How are you feeling today? (happy, sad, stressed, excited, tired): ");
        String mood = scanner.nextLine().trim().toLowerCase();
        respondToMood(mood);
        System.out.println("\n Remember: Emotions are valid, and so are *you*.");
        scanner.close();
    }
    public static void respondToMood(String mood) {
        switch (mood) {
            case "happy":
                System.out.println("That's awesome! Share your smile with the world but don't give that sweet smile that's reserved for me");
                break;
            case "sad":
                System.out.println(" It's okay to feel sad, do not make that puppy face Better days are coming and I am always here for you ");
                break;
            case "stressed":
                System.out.println(" Take a deep breath. You've handled tough days before, You are strong my love");
                break;
            case "excited":
                System.out.println(" Your energy is contagious! Keep shining Loveeeeeeee Youuuuuuuuuuu");
                break;
            case "tired":
                System.out.println(" Rest is productive too. Don't forget to take care of yourself lotss of love ");
                break;
            default:
                System.out.println(" I may not understand that feeling, but I'm here rooting for you");
        }
    }
}