public class StringConcatenationOperator {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1 + str2; // Using the + operator for string concatenation
        System.out.println(result); // Output: Hello, World!

        // Concatenating strings with other data types
        int num = 42;
        String combined = "The answer is: " + num; // The int is converted to a string
        System.out.println(combined); // Output: The answer is: 42
    }
}
