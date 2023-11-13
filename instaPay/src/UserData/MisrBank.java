package UserData;

public class MisrBank extends Bank{
    public MisrBank() {
        super();
    }

    public MisrBank(String BankAccountNumber, String BankName, String BranchName) {
        super(BankAccountNumber, BankName, BranchName);
    }

    @Override
    public double inquireBalance() { // need api

        // I should send this account number to bank api and bank api return the balance of this account number

        return 0;
    }

    @Override
    public boolean withdraw(double amount) {  // need api
        //        BankBalance -= amount;
        //     return true;
        return false;
    }

    @Override
    public boolean deposit(double amount) { // need api
        //        BankBalance += amount;
        //        return true;
        return false;
    }

}
