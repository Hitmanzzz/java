public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Convert to uppercase
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);

        // Convert to lowercase
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);

        // Extract a substring
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Replace a character or sequence
        String replaced = str.replace("World", "Java");
        System.out.println("Replaced string: " + replaced);

        // Check if a string starts with a specific prefix
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);

        // Check if a string ends with a specific suffix
        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith);

        // Check if a string contains a specific sequence
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Split the string into an array
        String[] splitArray = str.split(",");
        System.out.println("Split string:");
        for (String s : splitArray) {
            System.out.println(s.trim());
        }
    }
}
