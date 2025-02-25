import java.util.Scanner;
public class StudentMarks {
public static void main(String[] args) {
     System.out.println("Enter your Marks");
     Scanner marks =new Scanner(System.in);
     float totalMarks = 500;

float sub1 = marks.nextFloat();
float sub2 = marks.nextFloat();
float sub3 = marks.nextFloat();
float sub4 = marks.nextFloat();
float sub5 = marks.nextFloat();

float sum = sub1 + sub2 + sub3 + sub4+ sub5;
System.out.println("Your total marks is ");
System.out.println(sum);

float percentage = sum/totalMarks*100;
System.out.println("Your percentage is ");
System.out.println(percentage);

}
    
}
