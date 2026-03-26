import java.util.Scanner;
public class CalculateCGPA {
    public static void main(String[] args) {
        double res=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of semesters: ");
        int sems=sc.nextInt();
        for(int i=0;i<sems;i++){
            System.out.println("Enter the SGPA of semester "+(i+1)+": ");
            double sgpa=sc.nextDouble();
            
            res=res+sgpa;

        }
        double cgpa=res/sems;
        System.out.println("Your CGPA is: "+cgpa);
        
    }
}
