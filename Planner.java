import java.util.ArrayList;
import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Task  2. View Tasks  3. Remove Task  4. Exit");
            int choice = input.nextInt();
            input.nextLine();  
            if (choice == 4) break;
            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    tasks.add(input.nextLine());
                    System.out.println("Task added");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to remove ");
                    int index = input.nextInt();
                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task removed");
                    } else {
                        System.out.println("Invalid task number");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}