import java.util.Scanner;
public class Example3ifelse {
    public static void main(String[] args) {
        int passmark=18;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=sc.nextInt();
        if(marks>=passmark)
            System.out.println("Congratulations! You have passed the exam.");
        else
            System.out.println("Sorry, you have failed the exam. Better luck next time!");


    }
}
