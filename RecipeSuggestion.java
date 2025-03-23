import java.util.*;

class User {
    private String name;
    private List<String> ingredients;

    public User(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients); // Fix: Ensure it's a modifiable list
    }
    public void displayUserInfo() {
        System.out.println("\nUser: " + name);
        System.out.println("Available Ingredients: " + ingredients);
    }
    public List<String> getIngredients() {
        return ingredients;
    }
}
abstract class Recipe {
    abstract String getRecipe(List<String> ingredients);
}
class DesiRecipe extends Recipe {
    @Override
    public String getRecipe(List<String> ingredients) {
        if (ingredients.contains("chicken") && ingredients.contains("spices")) 
            return "How about making Chicken Karahi?";
        if (ingredients.contains("lentils") && ingredients.contains("rice")) 
            return "Try making Dal Chawal!";
        return "No desi dish found with given ingredients!";
    }
}
class FastFoodRecipe extends Recipe {
    @Override
    public String getRecipe(List<String> ingredients) {
        if (ingredients.contains("bread") && ingredients.contains("cheese")) 
            return "Grilled Cheese Sandwich sounds perfect!";
        if (ingredients.contains("potato") && ingredients.contains("oil")) 
            return "Make some crispy French Fries!";
        return "No fast food dish found with given ingredients!";
    }
}
public class RecipeSuggestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter available ingredients (comma-separated): ");
        List<String> ingredients = new ArrayList<>(Arrays.asList(sc.nextLine().toLowerCase().split(", ")));
        User user = new User(name, ingredients);
        System.out.print("Choose recipe type (Desi/FastFood): ");
        String type = sc.nextLine();
        Recipe recipe = null;
        if (type.equalsIgnoreCase("Desi")) {
            recipe = new DesiRecipe();
        } else if (type.equalsIgnoreCase("FastFood")) {
            recipe = new FastFoodRecipe();
        } else {
            System.out.println("Invalid recipe type! Please enter 'Desi' or 'FastFood'.");
            sc.close();
            return;
        }
        user.displayUserInfo();
        System.out.println("Suggested Recipe: " + recipe.getRecipe(user.getIngredients()));
        sc.close();
    }
}
