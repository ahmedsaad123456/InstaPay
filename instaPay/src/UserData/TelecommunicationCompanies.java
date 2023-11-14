package UserData;

import UserAuthentication.WalletAPI;

public class TelecommunicationCompanies extends Wallet {
    private String telecomProviderName;

    public TelecommunicationCompanies() {this.telecomProviderName = "";}

    public TelecommunicationCompanies(String telecomProviderName) {
        this.telecomProviderName = telecomProviderName;
    }

    public String getTelecomProviderName() {
        return telecomProviderName;
    }

    public void setTelecomProviderName(String telecomProviderName){
        this.telecomProviderName = telecomProviderName;
    }

    @Override
    public double inquireBalance() {

        String url="https://api-"+telecomProviderName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        return wAPI.inquireBalance(this.getMobileNumber());
    }

    @Override
    public boolean withdraw(double amount) {

        String url="https://api-"+telecomProviderName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        if(wAPI.withdraw(amount, this.getMobileNumber())){
            return true;
        }

        return false;
    }

    @Override
    public void deposit(double amount) {

        String url="https://api-"+telecomProviderName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        wAPI.deposite(amount, this.getMobileNumber());
    }

    @Override
    public boolean verifyAccount() {

        WalletAPI wAPI = new WalletAPI("https://api-"+telecomProviderName+"-service.com/");
        if (wAPI.verifyWallet(this.getMobileNumber())) {
            return true;
        }

        return false;
    }

}

