import java.util.*;

class Task implements Comparable<Task> {
    String name;
    Date dueDate;
    public Task(String name, Date dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }
    @Override
    public int compareTo(Task other) {
        return this.dueDate.compareTo(other.dueDate);
    }
    @Override
    public String toString() {
        return "Task: " + name + " | Due: " + dueDate;
    }
}
public class AssignmentDeadlineTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();
        while (true) {
            System.out.println("1. Add Assignment/Exam\n2. View Deadlines\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            if (choice == 1) {
                System.out.print("Enter task name ");
                String name = scanner.nextLine();
                System.out.print("Enter due date (yyyy-MM-dd) ");
                String dateStr = scanner.nextLine();
                try {
                    Date date = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
                    tasks.add(new Task(name, date));
                    Collections.sort(tasks);
                    System.out.println("Task added successfully");
                } catch (Exception e) {
                    System.out.println("Invalid date format");
                }
            } else if (choice == 2) {
                System.out.println("Upcoming Deadlines");
                for (Task task : tasks) {
                    System.out.println(task);
                }
            } else if (choice == 3) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}
