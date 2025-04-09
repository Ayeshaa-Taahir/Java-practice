import java.util.*;

class Artwork {
    private String title;
    private String artistName;
    private String theme;
    private boolean isApproved;
    public Artwork(String title, String artistName, String theme) {
        this.title = title;
        this.artistName = artistName;
        this.theme = theme;
        this.isApproved = false;
    }
    public void approve() {
        isApproved = true;
    }
    public boolean isApproved() {
        return isApproved;
    }
    public void display() {
        String status = isApproved ? "[Approved]" : "[Pending Approval]";
        System.out.println(title + " by " + artistName + " | Theme: " + theme + " " + status);
    }
    public String getTheme() {
        return theme;
    }
}
class Gallery {
    private List<Artwork> artworks = new ArrayList<>();
    public void submitArtwork(Artwork art) {
        artworks.add(art);
        System.out.println("Artwork submitted successfully. Awaiting approval.");
    }
    public void approveArtwork(String title) {
        for (Artwork art : artworks) {
            if (art.title.equalsIgnoreCase(title) && !art.isApproved()) {
                art.approve();
                System.out.println("Artwork approved");
                return;
            }
        }
        System.out.println("Artwork not found ");
    }
    public void viewAllArtworks() {
        for (Artwork art : artworks) {
            art.display();
        }
    }
    public void viewByTheme(String theme) {
        boolean found = false;
        for (Artwork art : artworks) {
            if (art.getTheme().equalsIgnoreCase(theme)) {
                art.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No artworks found under this theme");
        }
    }
}
public class ArtGallery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gallery gallery = new Gallery();
        int choice;
        do {
            System.out.println("\n--- Art Gallery ---");
            System.out.println("1. Submit Artwork");
            System.out.println("2. View All Artworks");
            System.out.println("3. View Artworks by Theme");
            System.out.println("4. Approve an Artwork");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter artist name ");
                    String artist = sc.nextLine();
                    System.out.print("Enter artwork title ");
                    String title = sc.nextLine();
                    System.out.print("Enter theme (e.g. Animals, Nature, Superheroes): ");
                    String theme = sc.nextLine();
                    gallery.submitArtwork(new Artwork(title, artist, theme));
                    break;
                case 2:
                    gallery.viewAllArtworks();
                    break;
                case 3:
                    System.out.print("Enter theme to filter ");
                    String filterTheme = sc.nextLine();
                    gallery.viewByTheme(filterTheme);
                    break;
                case 4:
                    System.out.print("Enter the title of the artwork to approve ");
                    String approveTitle = sc.nextLine();
                    gallery.approveArtwork(approveTitle);
                    break;
                case 5:
                    System.out.println("Thanks for using the Art Gallery");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 5);
        sc.close();
    }
}