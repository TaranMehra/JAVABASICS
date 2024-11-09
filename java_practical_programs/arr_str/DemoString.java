public class DemoString {

    public static void main(String[] args) {
        // Initializing a string
        String str = "Hello, Taranpreet Singh!";
        
        // Display the string
        System.out.println("Original String: " + str);
        
        // Get the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Concatenate two strings
        String str2 = " Welcome to Java!";
        String concatenatedStr = str + str2;
        System.out.println("Concatenated String: " + concatenatedStr);
        
        // Character at a specific index
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAt5);
        
        // Extracting a substring
        String substring = str.substring(7, 20);
        System.out.println("Substring from index 7 to 20: " + substring);
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);
        
        // Check if the string contains a certain word
        boolean containsWord = str.contains("Taranpreet");
        System.out.println("Does the string contain 'Taranpreet'? " + containsWord);
        
        // Replace a word in the string
        String replacedStr = str.replace("Taranpreet Singh", "Java Developer");
        System.out.println("String after replacement: " + replacedStr);
    }
}
