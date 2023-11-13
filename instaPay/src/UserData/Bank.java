package UserData;

public abstract class Bank implements Account {

    String BankAccountNumber;
    String BankName;
    String BranchName;

    public Bank() {
        BankAccountNumber = "";
        BankName = "";
        BranchName = "";
    }

    //------------------------------------------------------------------------------------------------------------------

    public Bank(String BankAccountNumber, String BankName, String BranchName) {
        this.BankAccountNumber = BankAccountNumber;
        this.BankName = BankName;
        this.BranchName = BranchName;
    }



    //------------------------------------------------------------------------------------------------------------------

    public String getBankAccountNumber() {return BankAccountNumber;}

    public void setBankAccountNumber(String bankAccountNumber) {BankAccountNumber = bankAccountNumber;}

    //------------------------------------------------------------------------------------------------------------------
    public String getBankName() {return BankName;}

    public void setBankName(String bankName) {BankName = bankName;}

    //------------------------------------------------------------------------------------------------------------------

    public String getBranchName() {return BranchName;}

    public void setBranchName(String branchName) {BranchName = branchName;}


    //-----------------------------------------------------------------------------------------------------------------


    //  the following functions are not competed yet

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
