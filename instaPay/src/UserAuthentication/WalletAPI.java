package UserAuthentication;

import UserData.ElectronicPaymentCompanies;
import UserData.Wallet;

public class WalletAPI {
    private static double balance = 10000;
    String url;

    WalletAPI(String u){
        url = u;
    }


    public void setURL(String u){
        url = u;
    }


    public double inquireBalance(int mobileNumber){
        return balance;
    }

    public boolean verifyMobileNumber(String mobile, String bankNum){

        return true;
    }

    public boolean withdraw(double b , int mobileNumber){
        if(b>balance){
            return false;
        }
        balance = balance - b;
        return true;
    }

    public void deposite(double b , int mobileNumber){
        balance = balance +b;
    }
}
