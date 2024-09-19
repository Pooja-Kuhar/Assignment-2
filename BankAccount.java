package ASSIGNMENT2;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance >= 0 ? initialBalance : 0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }

    // Method to check the balance
    public double checkBalance() {
        return balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }


// Usage example
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Alice", 1000.00);
        System.out.println(account);

        account.deposit(500);
        System.out.println("Balance after deposit: $" + account.checkBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: $" + account.checkBalance());

        account.withdraw(1500); // Trying to withdraw more than balance

        account.deposit(-200); // Trying to deposit a negative amount
    }
}
