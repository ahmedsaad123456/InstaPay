package UserData;

public abstract class Bank implements Account {

    String BankAccountNumber;

    public Bank() {
        BankAccountNumber = "";
    }

    //------------------------------------------------------------------------------------------------------------------

    public Bank(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }
    
    //------------------------------------------------------------------------------------------------------------------

    public String getBankAccountNumber() {return BankAccountNumber;}

    public void setBankAccountNumber(String bankAccountNumber) {BankAccountNumber = bankAccountNumber;}

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
