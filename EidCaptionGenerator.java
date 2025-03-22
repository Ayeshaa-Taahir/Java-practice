import java.util.*;
class User {
    private String name, picture;
    public User(String name, String picture) {
        this.name = name;
        this.picture = picture;
    }
    public void displayUserInfo() {
        System.out.println("\nUser: " + name + "\nUploaded Picture: " + picture);
    }
}
abstract class Caption {
    abstract String getCaption();
}
class SavageCaption extends Caption {
    private final String[] captions = {
        "Eid Mubarak! But first, let me take a selfie.", 
        "Dressed like royalty, but still waiting for Eidi!", 
        "Slaying this Eid like biryani slays hunger!"
    };
    @Override
    public String getCaption() {
        return captions[new Random().nextInt(captions.length)];
    }
}
class DesiCaption extends Caption {
    private final String[] captions = {
        "Shalwar tight, biryani sight, Eid feels just right!", 
        "Eidi de do warna block list mein chalay jao!", 
        "Naye kapray, purani yaadein, and a plate full of sheer khurma!"
    };
    @Override
    public String getCaption() {
        return captions[new Random().nextInt(captions.length)];
    }
}
public class EidCaptionGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        User user = new User(sc.nextLine(), "Eid Pic");
        System.out.print("Choose category (Savage or Desi): ");
        Caption caption = sc.nextLine().equalsIgnoreCase("Savage") ? new SavageCaption() : new DesiCaption();
        user.displayUserInfo();
        System.out.println("Caption: " + caption.getCaption());
    }
}