import java.util.Scanner;

public class Example2ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String source = "hemanth";
        if (name.equalsIgnoreCase(source))
            System.out.println("Welcome back, Hemanth!");
        else
            System.out.println("Access denied, Please try again " + name);
    }
}
