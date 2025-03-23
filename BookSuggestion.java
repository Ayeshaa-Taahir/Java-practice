import java.util.*;

class User {
    private String name;
    private String genrePreference;
    public User(String name, String genrePreference) {
        this.name = name;
        this.genrePreference = genrePreference;
    }
    public void displayUserInfo() {
        System.out.println("\nUser: " + name);
        System.out.println("Preferred Genre: " + genrePreference);
    }
    public String getGenrePreference() {
        return genrePreference;
    }
}
abstract class BookRecommendation {
    abstract String getBookSuggestion();
}
class FictionRecommendation extends BookRecommendation {
    @Override
    public String getBookSuggestion() {
        return "Recommended Fiction: 'To Kill a Mockingbird' by Harper Lee";
    }
}
class MysteryRecommendation extends BookRecommendation {
    @Override
    public String getBookSuggestion() {
        return "Recommended Mystery: 'Sherlock Holmes' by Arthur Conan Doyle";
    }
}
class ScienceFictionRecommendation extends BookRecommendation {
    @Override
    public String getBookSuggestion() {
        return "Recommended Sci-Fi: 'Dune' by Frank Herbert";
    }
}
public class BookSuggestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = sc.nextLine();
        System.out.print("Choose a genre (Fiction/Mystery/Sci-Fi) ");
        String genre = sc.nextLine();
        User user = new User(name, genre);
        BookRecommendation recommendation;
        if (genre.equalsIgnoreCase("Fiction")) {
            recommendation = new FictionRecommendation();
        } else if (genre.equalsIgnoreCase("Mystery")) {
            recommendation = new MysteryRecommendation();
        } else if (genre.equalsIgnoreCase("Sci-Fi")) {
            recommendation = new ScienceFictionRecommendation();
        } else {
            System.out.println("Invalid genre! Please choose Fiction, Mystery, or Sci-Fi");
            sc.close();
            return;
        }
        user.displayUserInfo();
        System.out.println(recommendation.getBookSuggestion());
        sc.close();
    }
}