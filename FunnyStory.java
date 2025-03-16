import java.util.Random;

public class FunnyStory {
    public static void main(String[] args) {
        Random random = new Random();

        String[] characters = {"Ayesha", "Manal", "Bakhtawar", "Areeba", "Reja","Faiqa"};
        String[] places = {"a magical forest", "a haunted house", "a compter lab", "a secret cave", "a mysterious library"};
        String[] actions = {"discovered a secret relationship", "annoy eachother", "built a university", "found an puppy", "became a Doremon"};
        String[] twists = {"between a princess and a driver", "but it was all a dream", "and saved the world", "and accidentally fall in love", "and met a talking cat"};
        String character = characters[random.nextInt(characters.length)];
        String place = places[random.nextInt(places.length)];
        String action = actions[random.nextInt(actions.length)];
        String twist = twists[random.nextInt(twists.length)];
       System.out.println("\n Here is your random funny story:\n");
        System.out.println(character + " went to " + place + " and " + action + ", " + twist + "!");

        System.out.println("\n The End! ");
    }
}