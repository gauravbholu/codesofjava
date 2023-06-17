package Operators.Oops;

public class BankAccount {
    private int accountNumber;
    private double balance;

    double deposit(double amount){
        return balance=balance+amount;
    }
    double withdraw(double amount){
        return amount;
    }
    double RemainBalance(double balance,double amount){
        return balance-amount;
    }

    public static void main(String[] args) {
        BankAccount bank=new BankAccount();
        bank.accountNumber=9113170;
        double deposit=500;
        double withdraw=200;
        double d=bank.deposit(deposit);
        double w=bank.withdraw(withdraw);
        double rb=bank.RemainBalance(deposit,withdraw);
        System.out.println("Deposit :" +d);
        System.out.println("Withdraw :" +w);
        System.out.println("Remaining Balance :" +rb);
        System.out.println("Your Account Number :"+bank.accountNumber + " Your Remaining Balance: "+rb);
    }

}
