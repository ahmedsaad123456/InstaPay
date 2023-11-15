package UserData;

import API.FawryWalletAPI;

public class FawryWallet extends Wallet{

    public FawryWallet() {
        super("Fawry Wallet");
        this.setWalletAPI(new FawryWalletAPI("https://api-service.com/"));
    }

    public FawryWallet(String mobileNumber) {
        super("Fawry Wallet");
        this.setWalletAPI(new FawryWalletAPI("https://api-service.com/"));
        this.setMobileNumber(mobileNumber);
    }




    @Override
    public boolean verifyAccount() {

        if (this.getWalletAPI().verifyWallet(this.getMobileNumber())) {
            return true;
        }

        return false;
    }


    @Override
    public double inquireBalance() {

        return this.getWalletAPI().inquireBalance(this.getMobileNumber());
    }

    @Override
    public boolean withdraw(double amount) {

        if(this.getWalletAPI().withdraw(amount, this.getMobileNumber() )){
            return true;
        }

        return false;
    }

    @Override
    public void deposit(double amount) {

        this.getWalletAPI().deposit(amount, this.getMobileNumber());
    }



}
