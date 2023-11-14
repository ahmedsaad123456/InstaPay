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
    public boolean verifyAccount() {

        BankAPI bankAPI = new BankAPI("https://alahlyapi.service.com/");
        if (bankAPI.verifyBank(this.getBankAccountNumber(), this.getMobileNumber())) {
            return true;
        }

        return false;
    }

    @Override
    public double inquireBalance() {

        BankAPI bankAPI = new BankAPI("https://alahlyapi.service.com/");
        return bankAPI.inquireBalance(this.getBankAccountNumber(),this.getMobileNumber());

    }

    @Override
    public boolean withdraw(double amount) {

        BankAPI bankAPI = new BankAPI("https://alahlyapi.service.com/");
        if (bankAPI.withdraw(amount, this.getBankAccountNumber(),this.getMobileNumber())) {
            return true;

        }
        return false;
    }

    @Override
    public void deposit( double amount){

        BankAPI bankAPI = new BankAPI("https://alahlyapi.service.com/");
        bankAPI.deposite(amount, this.getBankAccountNumber(),this.getMobileNumber());
    }

}
