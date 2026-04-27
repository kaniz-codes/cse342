public class stringOperations {
    public static void main(String[] args) {

        String s = "  Kaniz Fatema123 BUBT CSE  ";

        System.out.println("Original String: " + s);

        // Remove extra spaces using " trim() "
        String trimmed = s.trim();
        System.out.println("After trim: " + trimmed);

        // Remove all digits using " replaceAll() "
        String noDigit = trimmed.replaceAll("[0-9]", "");
        System.out.println("After removing digits: " + noDigit);

        // Split the string into words using " split() "
        String[] words = noDigit.split(" ");
        System.out.println("Words:");
        for (String w : words) {
            System.out.println(w);
        }

        // Print the length using " length() "
        System.out.println("Length: " + noDigit.length());

        // Extract first character using " charAt() "
        System.out.println("First Character: " + noDigit.charAt(0));

        // Convert the string to uppercase using " toUpperCase() "
        System.out.println("Uppercase: " + noDigit.toUpperCase());

        // Convert the string to lowercase using " toLowerCase() "
        System.out.println("Lowercase: " + noDigit.toLowerCase());

        // Search "BUBT" using " indexOf() "
        System.out.println("Index of BUBT: " + noDigit.indexOf("BUBT"));

        // Extract "Kaniz" using substring()
        String sub = noDigit.substring(0, 5);
        System.out.println("Substring: " + sub);

        // Compare "Kaniz" and "kaniz" using equals() and equalsIgnoreCase()
        System.out.println("equals result: " + "Kaniz".equals("kaniz"));

        System.out.println("equalsIgnoreCase result: " + "Kaniz".equalsIgnoreCase("kaniz"));

        // Concatenate "Student: " with the final string using concat()
        String finalString = "Student: ".concat(noDigit);
        System.out.println("Final String: " + finalString);
    }
}