import java.util.Scanner;

public class ChaandRaatWishes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chand Raat Mubarak! Kisko special tareeke se wish karna chahoge? (friend/family/colleague/fiance)");
        String relation = scanner.nextLine().trim().toLowerCase();
        String message = "";
        switch (relation) {
            case "friend":
                message = "Mere pyaare dost, Chand Raat Mubarak! \n\n" +
                          "Eid ka chand nazar aaya ya abhi bhi WhatsApp status hi dekh rahe ho? \n" +
                          "Allah tumhari zindagi bhi Eid ki raat jitni roshan kare aur tumhe itni Eidi mile ki ginti bhool jao! \n" +
                          "Bas yeh yaad rakhna, Eidi dena mat bhoolna warna dosti pe sawal uth sakta hai!";
                break;
            case "family":
                message = "Meri pyari family, Chand Raat Mubarak! \n\n" +
                          "Is raat ki roshni hamesha hamari zindagi ka hissa bani rahe. \n" +
                          "Mithai, naye kapde, aur pyaar bhari baatein – bas yahi toh chand raat ka asal maza hai! \n" +
                          "Dua hai ke hamari zindagi bhi hamesha itni hi roshan aur khushgawar rahe. \n" +
                          "Waise, Eidi ka budget final ho gaya ya abhi bhi soch rahe hain?";
                break;
            case "colleague":
                message = "Dear colleague, Chand Raat Mubarak! \n\n" +
                          "Aaj ka din sirf deadlines ka nahi, mithai aur khushiyon ka hai! \n" +
                          "Allah kare ke aapki zindagi har din naye umeed aur kamyabi se bhari rahe. \n" +
                          "By the way, Eid bonus ka kya scene hai? Ya sirf boss ke naye targets ka wait ho raha hai?";
                break;
            case "fiance":
                message = "Meri rooh ka sukoon, meri muskurahat ki wajah, Chand Raat Mubarak! \n\n" +
                          "Aaj ka chand jitna haseen hai, tumhari aankhon ki chamak usse bhi zyada khoobsurat lag rahi hai. \n" +
                          "Meri dua hai ke tumhari zindagi hamesha Eid ki raat jitni roshan aur pyari rahe. \n" +
                          "Bas ab batao, tumhari mehndi ka rang kitna gehra hai? Kya meri mohabbat ka asar dikh raha hai? \n" +
                          "Aur meri Eidi sirf ek pyaari muskurahat hogi ya kurtai ka intezar karo..??";
                break;
            default:
                message = "Chand Raat Mubarak! \n\n" +
                          "May this night bring happiness, peace, and endless blessings to your life. \n" +
                          "Enjoy the celebrations and get ready for an amazing Eid ahead!";
        }
        System.out.println(message);
        scanner.close();
    }
}