// BankAccount class represents a simple bank account
class BankAccount {

    // Private variable to store account number
    private int accountNumber;

    // Private variable to store account balance
    private double balance;

    // Method to set the account number
    public void setAccountNumber(int num) {
        accountNumber = num;
    }

    // Method to set the account balance
    public void setBalance(double bal) {
        balance = bal;
    }

    // Method to get the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to get the account balance
    public double getBalance() {
        return balance;
    }
}

// Main class
public class Main {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create an object of BankAccount
        BankAccount acc = new BankAccount();

        // Set account number
        acc.setAccountNumber(12345);

        // Set account balance
        acc.setBalance(5000);

        // Print account number
        System.out.println("Account Number: " + acc.getAccountNumber());

        // Print account balance
        System.out.println("Balance: " + acc.getBalance());
    }
}
