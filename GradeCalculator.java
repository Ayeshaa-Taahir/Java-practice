import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subjects ");
        int subjects = input.nextInt();
        double total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += input.nextDouble();
        }
        double average = total / subjects;
        System.out.println("Total Marks " + total);
        System.out.println("Average " + average);
        System.out.println("Grade " + getGrade(average));
        input.close();
    }

    static String getGrade(double avg) {
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        return "F";
    }
}