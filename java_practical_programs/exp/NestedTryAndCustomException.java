// Custom Exception Class
class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

public class NestedTryAndCustomException {
    public static void main(String[] args) {
        int[] numbers = {10, 5, -1}; // -1 is an invalid value for this example

        try {
            System.out.println("Outer try block");

            try {
                if (numbers[2] < 0) {
                    throw new InvalidValueException("Negative values are not allowed: " + numbers[2]);
                }
                System.out.println("Number: " + numbers[2]);
            } catch (InvalidValueException e) {
                System.out.println("Caught custom exception: " + e.getMessage());
            }

            // Simulate another exception
            int result = numbers[0] / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in outer try: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block executed.");
        }
    }
}
