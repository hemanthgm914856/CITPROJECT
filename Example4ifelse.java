import java.util.Scanner;
import java.util.scanner;
public class Example4ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Whichsubject you have studied in your +2(Biology or CS)? ");
        String sub=sc.nextLine();
        String equal="Biology";
        if(sub.equalsIgnoreCase(equal))
        System.out.println("Ypu can take MBBS.....");
        else
        System.out.println("You can take BCA/BE.....");
    }
}
