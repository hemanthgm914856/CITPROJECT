public class JumpReturn {
    public static void main(String[] args) {
        System.out.println("This is the main method.");
        return; // Exits the main method immediately
        // The following line will not be executed
        System.out.println("This line will not be printed.");
    }
}
