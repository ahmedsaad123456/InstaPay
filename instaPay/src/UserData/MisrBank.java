package UserData;

import API.MisrBankAPI;

public class MisrBank extends Bank{
    public MisrBank() {
        super(" " , "Misr");
        this.setBankAPI(new MisrBankAPI("https://misrapi.service.com/"));
    }

    public MisrBank(String bankAccountNumber) {
        super(bankAccountNumber , "MisrBank");
        this.setBankAPI(new MisrBankAPI("https://misrapi.service.com/"));

    }

    public MisrBank(String bankAccountNumber , String mobileNumber) {
        super(bankAccountNumber , "MisrBank");
        this.setBankAPI(new MisrBankAPI("https://misrapi.service.com/"));
        this.setMobileNumber(mobileNumber);
    }


    @Override
    public double inquireBalance() {

        return this.getBankAPI().inquireBalance(this.getBankAccountNumber(),this.getMobileNumber());
    }

    @Override
    public boolean withdraw(double amount) {

        if (this.getBankAPI().withdraw(amount, this.getBankAccountNumber(), this.getMobileNumber())) {
            return true;

        }
        return false;
    }

    @Override
    public void deposit( double amount){

        this.getBankAPI().deposit(amount, this.getBankAccountNumber(), this.getMobileNumber());
    }



    @Override
    public boolean verifyAccount() {

        if (this.getBankAPI().verifyBank(this.getBankAccountNumber())) {
            return true;
        }

        return false;
    }

}