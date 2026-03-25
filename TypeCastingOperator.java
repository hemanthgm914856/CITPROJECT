public class TypeCastingOperator {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int num = 100;
        double doubleNum = num; // Automatic type casting from int to double
        System.out.println("Before Implicit Type Casting: " + num);
        System.out.println("After Implicit Type Casting: " + doubleNum);

        // Explicit Type Casting (Narrowing)
        double d = 9.78;
        int i = (int) d; // Manual type casting from double to int
        System.out.println("Before Explicit Type Casting: " + d);
        System.out.println("After Explicit Type Casting: " + i);

    }

}
