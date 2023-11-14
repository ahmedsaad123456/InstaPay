package UserData;

import UserAuthentication.WalletAPI;

public class ElectronicPaymentCompanies extends Wallet{
    private String paymentCompanyName;

    public ElectronicPaymentCompanies() {this.paymentCompanyName = "";}
    public ElectronicPaymentCompanies(String paymentCompanyName) {
        this.paymentCompanyName = paymentCompanyName;
    }

    public String getPaymentCompanyName() {return paymentCompanyName;}

    public void setPaymentCompanyName(String paymentCompanyName) {this.paymentCompanyName = paymentCompanyName;}

    @Override
    public double inquireBalance() {

        String url="https://api-"+paymentCompanyName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        return wAPI.inquireBalance(this.user.getMobileNumber());
    }

    @Override
    public boolean withdraw(double amount) {

        String url="https://api-"+paymentCompanyName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        if(wAPI.withdraw(amount, this.user.getMobileNumber() )){
            return true;
        }

        return false;
    }

    @Override
    public void deposit(double amount) {

        String url="https://api-"+paymentCompanyName+"-service.com/inquireBalance";
        WalletAPI wAPI = new WalletAPI(url);
        wAPI.deposite(amount, this.user.getMobileNumber());
    }

}
