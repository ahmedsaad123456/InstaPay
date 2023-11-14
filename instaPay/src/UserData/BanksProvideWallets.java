package UserData;

import UserAuthentication.WalletAPI;

public class BanksProvideWallets extends Wallet{
    private String bankName;

    public BanksProvideWallets() {this.bankName = "";}

    public BanksProvideWallets(String bankName){this.bankName = bankName;}

    public String getBankName(){return bankName;}

    public void setBankName(String bankName){this.bankName = bankName;}

    @Override
    public double inquireBalance() {

        String url="https://api-"+bankName+"-service.com/inquireBalance";

        WalletAPI wAPI = new WalletAPI(url);
        return wAPI.inquireBalance(this.getMobileNumber());
    }

    @Override
    public boolean withdraw(double amount) {
        String url="https://api-"+bankName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        if(wAPI.withdraw(amount, this.getMobileNumber())){
            return true;
        }

        return false;
    }

    @Override
    public void deposit(double amount) {
        String url="https://api-"+bankName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        wAPI.deposite(amount, this.getMobileNumber());
    }

    @Override
    public boolean verifyAccount() {

        WalletAPI wAPI = new WalletAPI("https://api-"+bankName+"-service.com/");
        if (wAPI.verifyWallet(this.getMobileNumber())) {
            return true;
        }

        return false;
    }

}
