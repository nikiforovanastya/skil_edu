package Lesson5_task1;

public class ChildBankAccount {
    private double balance;
    private double maxBalance;
    public ChildBankAccount(double maxBalance){
        this.maxBalance = maxBalance;
    }
    public boolean depositMoney(double value) {
        double curBalance = balance + value;
        if ((value < 0) || (curBalance > maxBalance)){
            return false;
        } else {
            balance = curBalance;
            return true;
        }
    }
    public boolean debitMoney(double value) {
        double curBalance = balance - value;
        if ((value < 0) || (curBalance < 0)){
            return false;
        } else {
            balance = curBalance;
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }
}
