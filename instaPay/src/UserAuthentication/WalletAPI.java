package UserAuthentication;

import UserData.ElectronicPaymentCompanies;
import UserData.Wallet;

public class WalletAPI {
    private static double balance = 10000;
    String url;

    public WalletAPI(String u){
        url = u;
    }


    public void setURL(String u){
        url = u;
    }


    public double inquireBalance(String mobileNumber){
        return balance;
    }

    public boolean verifyMobileNumber(String mobile, String bankNum){

        return true;
    }
    public boolean verifyWallet(String mobileNumber){

        return true;
    }

    public boolean withdraw(double b , String mobileNumber){
        if(b>balance){
            return false;
        }
        balance = balance - b;
        return true;
    }

    public void deposite(double b , String mobileNumber){
        balance = balance +b;
    }
}
