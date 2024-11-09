public class DemoStringBuffer {

    public static void main(String[] args) {
        // Initializing a StringBuffer
        StringBuffer buffer = new StringBuffer("Hello, Taranpreet Singh!");
        
        // Display the original buffer
        System.out.println("Original StringBuffer: " + buffer);
        
        // Append a string
        buffer.append(" Welcome to Java!");
        System.out.println("After append: " + buffer);
        
        // Insert a string at a specific index
        buffer.insert(7, "Mr. ");
        System.out.println("After insert: " + buffer);
        
        // Replace a part of the string
        buffer.replace(7, 11, "Dr.");  // Replaces "Mr." with "Dr."
        System.out.println("After replace: " + buffer);
        
        // Delete a portion of the string
        buffer.delete(7, 11);  // Deletes "Dr. "
        System.out.println("After delete: " + buffer);
        
        // Reverse the entire buffer
        buffer.reverse();
        System.out.println("After reverse: " + buffer);
        
        // Get the length of the buffer
        int length = buffer.length();
        System.out.println("Length of StringBuffer: " + length);
        
        // Set the buffer back to original by reversing it again
        buffer.reverse();
        System.out.println("Reset to original form (after second reverse): " + buffer);
    }
}
