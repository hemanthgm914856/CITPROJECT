import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18){
            if(age>=65)
                System.out.println("Eligible to vote and and avail government schemes for senior citizens.");
            else
                System.out.println("You are not eligible to avail government schemes for senior citizens but you are eligible to vote.");
        }
        else
            System.out.println("You are not eligible to vote.");
    }
}
