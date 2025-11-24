class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int num) {
        accountNumber = num;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setAccountNumber(12345);
        acc.setBalance(5000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}
