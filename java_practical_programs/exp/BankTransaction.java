import java.io.*;

// Custom Exception for Banking Transactions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        double balance = 500.0;
        double withdrawalAmount = 600.0;

        System.out.println("Bank Transaction Program by Taranpreet Singh");

        try {
            // File operation simulated
            BufferedReader reader = new BufferedReader(new FileReader("account.txt"));
            try {
                System.out.println("Reading file...");
                String line = reader.readLine();
                System.out.println("File Content: " + line);
            } catch (IOException e) {
                System.out.println("IOException while reading file: " + e.getMessage());
            } finally {
                reader.close();
                System.out.println("File closed.");
            }

            // Nested try for bank transaction
            try {
                if (withdrawalAmount > balance) {
                    throw new InsufficientFundsException("Insufficient balance for withdrawal");
                }
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful! Remaining balance: $" + balance);
            } catch (InsufficientFundsException e) {
                System.out.println("Transaction failed: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } finally {
            System.out.println("End of transaction - Program by Taranpreet Singh.");
        }
    }
}
