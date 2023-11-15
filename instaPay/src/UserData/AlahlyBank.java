package UserData;

import API.AlahlyBankAPI;
import API.BankAPI;

public class AlahlyBank extends Bank {


    public AlahlyBank() {
        super(" " , "Alahly");
        this.setBankAPI(new AlahlyBankAPI("https://alahlyapi.service.com/"));
    }

    public AlahlyBank(String bankAccountNumber) {
        super(bankAccountNumber , "Alahly");
        this.setBankAPI(new AlahlyBankAPI("https://alahlyapi.service.com/"));
    }

    public AlahlyBank(String bankAccountNumber , String mobileNumber) {
        super(bankAccountNumber , "Alahly");
        this.setBankAPI(new AlahlyBankAPI("https://alahlyapi.service.com/"));
        this.setMobileNumber(mobileNumber);
    }

    @Override
    public boolean verifyAccount() {

        if (this.getBankAPI().verifyBank(this.getBankAccountNumber())) {
            return true;
        }

        return false;
    }

    @Override
    public double inquireBalance() {

        return this.getBankAPI().inquireBalance(this.getBankAccountNumber(),this.getMobileNumber());

    }

    @Override
    public boolean withdraw(double amount) {

        if (this.getBankAPI().withdraw(amount, this.getBankAccountNumber(),this.getMobileNumber())) {
            return true;

        }
        return false;
    }

    @Override
    public void deposit( double amount){

        this.getBankAPI().deposit(amount, this.getBankAccountNumber(),this.getMobileNumber());
    }

}
