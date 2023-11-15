package UserData;

import API.CIBWalletAPI;

public class CIBWallet extends Wallet{

    public CIBWallet() {
        super("CIB Wallet");
        this.setWalletAPI(new CIBWalletAPI("https://api-service.com/inquireBalance"));

    }
    public CIBWallet(String mobileNumber) {
        super("CIB Wallet");
        this.setWalletAPI(new CIBWalletAPI("https://api-service.com/inquireBalance"));
        this.setMobileNumber(mobileNumber);
    }





    @Override
    public double inquireBalance() {

        return this.getWalletAPI().inquireBalance(this.getMobileNumber());
    }

    @Override
    public boolean withdraw(double amount) {

        if(this.getWalletAPI().withdraw(amount, this.getMobileNumber())){
            return true;
        }

        return false;
    }

    @Override
    public void deposit(double amount) {

        this.getWalletAPI().deposit(amount, this.getMobileNumber());
    }

    @Override
    public boolean verifyAccount() {

        if (this.getWalletAPI().verifyWallet(this.getMobileNumber())) {
            return true;
        }

        return false;
    }

}
