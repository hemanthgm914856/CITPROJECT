import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of units consumed: ");
        double units = sc.nextDouble();
        double billAmount = 0.0;
        if (units <= 150)
            billAmount = units * 1.5;
        else
            billAmount = units * 3.0;
        System.out.println("The electricity bill amount is: " + billAmount);
    }
}
