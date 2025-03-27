import java.util.Scanner;

public class EidWishes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who do you want to send your wishes to? (friend/family/colleague/fiance)");
        String relation = scanner.nextLine().trim().toLowerCase();    
        String message = "";
        switch (relation) {
            case "friend":
                message = "Mere nikamme dost, Eid Mubarak! \n\n" +
                          "Allah tumhari sari mannatain poori kare, magar pehle subah jaldi uthne ka azm kar lo! \n" +
                          "Eid ke naye kapde toh le aaye ho na? Ya phir phir wahi purani t-shirt pehen ke selfies le rahe ho? \n" +
                          "Eid ka asli maza biryani aur sheer khurma mein nahi, balki doston se zabardasti Eidi nikalwane mein hai! \n" +
                          "Chalo, ab Eidi do warna next Eid tak bhool jao ke tumhara ek best friend bhi hai!";
                break;
            case "family":
                message = "Meri pyaari family, Eid Mubarak! \n\n" +
                          "Is Eid pe dua hai ke hamari zindagi hamesha pyar aur khushiyon se bhari rahe. \n" +
                          "Waise, is ghar mein Eidi sirf chhoto ko milti hai ya bade bhi qualify karte hain? \n" +
                          "Agar aaj koi special dish bana raha hai, toh samajh lo ke wo meri taraf se Eidi hai!";
                break;
            case "colleague":
                message = "Eid Mubarak mere hardworking colleague! \n\n" +
                          "Aaj ka din emails aur deadlines ka nahi, sheer khurma aur biryani ka hai! \n" +
                          "Dua hai ke boss bhi aaj achanak se generous ho jayein aur humein chhutti de dein! \n" +
                          "By the way, Eid party ka kya scene hai? Ya sirf humari mehnat ka intezam ho raha hai?";
                break;
            case "fiance":
                message = "Meri jaan, meri chandni, Eid Mubarak! \n\n" +
                          "Allah humari mohabbat ko har din naye rang de aur humesha saath rakhe. \n" +
                          "Eid ka chand toh roz naya aata hai, magar tumhari muskurahat usse bhi zyada khoobsurat lagti hai! \n" +
                          "Eid pe special treat toh banta hai, toh batao… meri Eidi sirf tumhari pyaari baatein hain ya kuch aur bhi milega? \n" +
                          "Mujhe toh lagta hai ek pyara hug aur tumhare haathon ka sheer khurma dono milne chahiye!";
                break;
            default:
                message = "Eid Mubarak! \n\n" +
                          "May this Eid bring happiness, success, and peace into your life. \n" +
                          "Stay blessed and enjoy this beautiful occasion with your loved ones!";
        }
        System.out.println(message);
        scanner.close();
    }
}