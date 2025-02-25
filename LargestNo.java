import java.util.Scanner;
public class LargestNo {
    public static void main(String[] args) {
        Scanner largeNo = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = largeNo.nextInt();

        System.out.println("Enter number 2");
        int b = largeNo.nextInt();

        System.out.println("Enter number 3");
        int c = largeNo.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is Largest");
            }
        }
        else if(b>c){
            System.out.println(b+" is Largest");
        }
        else{
            System.out.println(c+" is Largest");
        }
    }
}
