import java.util.Scanner;

public class Example5ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator ");
        int num = sc.nextInt();
        System.out.println("Enter denominator ");
        int den = sc.nextInt();
        if (den != 0)
            System.out.println("The result is: " + (num / den));
        else
            System.out.println("Error: Denominator cannot be zero. Please provide a non-zero denominator.");

    }
}
