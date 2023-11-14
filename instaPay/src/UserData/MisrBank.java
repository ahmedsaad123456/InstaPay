package UserData;

import UserAuthentication.BankAPI;

public class MisrBank extends Bank{
    public MisrBank() {
        super();
    }

    public MisrBank(String BankAccountNumber) {
        super(BankAccountNumber);
    }

    @Override
    public double inquireBalance() {

        BankAPI bankAPI = new BankAPI("https://misrapi.service.com/");
        return bankAPI.inquireBalance(this.getBankAccountNumber(),this.user.getMobileNumber());
    }

    @Override
    public boolean withdraw(double amount) {

        BankAPI bankAPI = new BankAPI("https://misrapi.service.com/");
        if (bankAPI.withdraw(amount, this.getBankAccountNumber(), this.user.getMobileNumber())) {
            return true;

        }
        return false;
    }

    @Override
    public void deposit( double amount){

        BankAPI bankAPI = new BankAPI("https://misrapi.service.com/");
        bankAPI.deposite(amount, this.getBankAccountNumber(), this.user.getMobileNumber());
    }

}