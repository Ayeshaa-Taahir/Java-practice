import java.util.*;

public class ScrambleWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"gulabo", "eyeshah", "aishu", "Shimla", "areesha"};
        Random random = new Random();

        String word = words[random.nextInt(words.length)];
        List<Character> letters = new ArrayList<>();
        for (char c : word.toCharArray()) letters.add(c);
        Collections.shuffle(letters);
        StringBuilder mixedWord = new StringBuilder();
        for (char c : letters) mixedWord.append(c);
        System.out.println("Unscramble the word " + mixedWord);
        String guess;

        do {
            System.out.print("Your guess ");
            guess = input.nextLine();
            if (!guess.equalsIgnoreCase(word)) {
                System.out.println("Wrong");
            }
        } while (!guess.equalsIgnoreCase(word));
        System.out.println("Correct, The word is " + word);
        input.close();
    }
}