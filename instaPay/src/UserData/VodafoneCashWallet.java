package UserData;

import API.VodafoneCashAPI;

public class VodafoneCashWallet extends Wallet {

    public VodafoneCashWallet() {
        super("Vodafone Cash Wallet");
        this.setWalletAPI(new VodafoneCashAPI("https://api-service.com/"));

    }
    public VodafoneCashWallet(String mobileNumber) {
        super("Vodafone Cash Wallet");
        this.setWalletAPI(new VodafoneCashAPI("https://api-service.com/"));
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

