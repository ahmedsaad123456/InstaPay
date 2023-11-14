package UserData;

import UserAuthentication.BankAPI;

public class AlahlyBank extends Bank {

    public AlahlyBank() {
        super();
    }

    public AlahlyBank(String BankAccountNumber) {
        super(BankAccountNumber);
    }

    @Override
    public double inquireBalance() {

        BankAPI bankAPI = new BankAPI("https://alahlyapi.service.com/");
        return bankAPI.inquireBalance(this.getBankAccountNumber(),this.user.getMobileNumber());

    }

    @Override
    public boolean withdraw(double amount) {

        BankAPI bankAPI = new BankAPI("https://alahlyapi.service.com/");
        if (bankAPI.withdraw(amount, this.getBankAccountNumber(), this.user.getMobileNumber())) {
            return true;

        }
        return false;
    }

    @Override
    public void deposit( double amount){

        BankAPI bankAPI = new BankAPI("https://alahlyapi.service.com/");
        bankAPI.deposite(amount, this.getBankAccountNumber(), this.user.getMobileNumber());
    }

}
