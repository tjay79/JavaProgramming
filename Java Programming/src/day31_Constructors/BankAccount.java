package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public int accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $"+balance);
    }

    public void deposit(double depositAmount){

        if(depositAmount<=0){
            System.out.println("Deposit can not be zero or negative");
            return;//exits the method
        }
        balance+=depositAmount;

    }

    public void withdraw(double withdrawalAmount){
        if (withdrawalAmount>balance){
            System.out.println("insufficient balance");
            return;
        }
        if(withdrawalAmount<=0){
            System.out.println("Withdrawal amount cannot be positive or zero");
            return;
        }
        balance-=withdrawalAmount;
    }
}
