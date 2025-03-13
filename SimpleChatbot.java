import java.util.HashMap;
import java.util.Scanner;

class ChatBot {
    private HashMap<String, String> responses;

    ChatBot() {
        responses = new HashMap<>();
        responses.put("hello", "Hi there! How can I help?");
        responses.put("how are you", "I'm just a bot, but I'm doing great!");
        responses.put("your name", "I'm ChatBot, your virtual assistant.");
        responses.put("bye", "Goodbye! Have a great day!");
    }

    void respond(String input) {
        input = input.toLowerCase();
        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                System.out.println(responses.get(key));
                return;
            }
        }
        System.out.println("I don't understand that Can you ask something else?");
    }
}

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChatBot bot = new ChatBot();
        System.out.println("ChatBot: Hello! Type something to chat Type 'exit' to stop");

        while (true) {
            System.out.print("You: ");
            String userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("ChatBot: Bye Have a nice day!");
                break;
            }
            bot.respond(userInput);
        }

        scan.close();
    }
}