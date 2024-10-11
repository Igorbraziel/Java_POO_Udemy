package Constructors_Encapsulation;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountMoney;

    public BankAccount(int accountNumber, String accountHolderName, double accountMoney){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountMoney = accountMoney;
    }

    public BankAccount(int accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountMoney = 0;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public double getAccountMoney(){
        return this.accountMoney;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public void accountWithdrawal(double price){
        this.accountMoney -= (price + 5);
    }

    public void accountDeposit(double price){
        this.accountMoney += price;
    }

    public String toString(){
        return 
        "Account " + 
        this.accountNumber +
        ", Holder: " +
        this.accountHolderName +
        ", Balance: $ " +
        String.format("%.2f", this.accountMoney);
    }
}