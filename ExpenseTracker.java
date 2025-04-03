import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Expense implements Comparable<Expense> {
    private String category;
    private double amount;
    private LocalDate date;
    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public LocalDate getDate() { return date; }
    @Override
    public int compareTo(Expense other) {
        return Double.compare(other.amount, this.amount); 
    }
}
class ExpenseTracker1 {
    private List<Expense> expenses;

    public ExpenseTracker1() {
        expenses = new ArrayList<>();
    }
    public void addExpense(String category, double amount, String date) {
        expenses.add(new Expense(category, amount, date));
        System.out.println("Expense added: " + category + " - $" + amount);
    }
    public void viewExpenses() {
        expenses.sort(Comparator.naturalOrder()); 
        System.out.println("\nYour Expenses:");
        for (Expense exp : expenses) {
            System.out.println("- " + exp.getCategory() + " | $" + exp.getAmount() + " | " + exp.getDate());
        }
    }
    public void filterByMonth(int year, int month) {
        System.out.println("\nExpenses for " + year + "-" + month + ":");
        expenses.stream()
                .filter(exp -> exp.getDate().getYear() == year && exp.getDate().getMonthValue() == month)
                .forEach(exp -> System.out.println("- " + exp.getCategory() + " | PKr" + exp.getAmount() + " | " + exp.getDate()));
    }
}
public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker1 tracker = new ExpenseTracker1();
        tracker.addExpense("Food", 1000, "2025-04-01");
        tracker.addExpense("Transport", 1000, "2025-04-02");
        tracker.addExpense("Entertainment", 5000, "2025-03-28");
        tracker.addExpense("Groceries", 10000, "2025-04-03");
        tracker.viewExpenses();
        tracker.filterByMonth(2025, 4);
        scanner.close();
    }
}