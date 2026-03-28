public class ReturnFirstDigit {
    public static void main(String[] args) {
        int num = 5666;
        while (num >= 10) {
            num /= 10; 
        }
        System.out.println("The first digit is: " + num);
    }
}
