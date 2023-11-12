package UserData;

import UserAuthentication.BankAPI;

public class Bank {
    String BankAccountNumber;
    public String getBankAccountNumber() {return BankAccountNumber;}

    public void setBankAccountNumber(String bankAccountNumber) {BankAccountNumber = bankAccountNumber;}


    String BankName;
    public String getBankName() {return BankName;}

    public void setBankName(String bankName) {BankName = bankName;}


    String BranchName;
    public String getBranchName() {return BranchName;}

    public void setBranchName(String branchName) {BranchName = branchName;}


    double BankBalance;
    public double getBankBalance() {return BankBalance;} // inquire about balance

    public void setBankBalance(double bankBalance) {BankBalance = bankBalance;}

    public Bank() {
        BankAccountNumber = "";
        BankName = "";
        BranchName = "";
        BankBalance = 0.0;
    }

    public Bank(String BankAccountNumber, String BankName, String BranchName, double BankBalance) {
        this.BankAccountNumber = BankAccountNumber;
        this.BankName = BankName;
        this.BranchName = BranchName;
        this.BankBalance = BankBalance;
    }

//    public boolean deposit(double amount) {
//        BankBalance += amount;
//        return true;
//    }

//    public boolean withdraw(double amount) {
//        BankBalance -= amount;
//        return true;
//    }


    public double inquireBalance(String BAccountNumber) {
        // I should send this account number to bank api and bank api return the balance of this account number
        // and I store it in BankBalance here

        // BankAPI bAPI = new BankAPI(String BAccountNumber);
        //BankBalance = bAPI.getBalance();
        return BankBalance;
    }



}
