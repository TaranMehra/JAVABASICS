public class BasicExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {10, 0};
        String input = null;

        try {
            // Attempting division and accessing an array
            System.out.println("Result: " + (numbers[0] / numbers[1]));
            System.out.println("Array element: " + numbers[2]);
            System.out.println("Input length: " + input.length());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}

