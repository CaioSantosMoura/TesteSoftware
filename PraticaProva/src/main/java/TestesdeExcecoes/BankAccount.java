package TestesdeExcecoes;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Saldo insuficiente");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}
