package day35_PracticeTasks;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        if(accountNumber<=0){
            System.out.println("Invalid account number");
            System.exit(0);
        }

        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Deposit must be more than zero");
            return;
        }
        setBalance(balance+amount);

    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid amount, amount must be greater than zero");
            return;
        }
        setBalance(balance-amount);
    }

    public void checkBalance(){
        System.out.println("Current balnce is: "+balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
