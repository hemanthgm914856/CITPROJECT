public class ShiftOperator {
    public static void main(String[] args) {
        int x=8;
        System.out.println("Left Shift: "+(x<<1)); // formula x*2pow(n)
        System.out.println("Right Shift: "+(x>>1)); // formula x/2pow(n)
        System.out.println("Unsigned Right Shift: "+(x>>>2));
        
    }
}
