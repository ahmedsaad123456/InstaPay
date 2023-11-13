package UserAuthentication;

import UserData.ElectronicPaymentCompanies;
import UserData.Wallet;

public class WalletAPI {
    private static double balance = 10000;


    public double inquireBalance(){
        return balance;
    }

    public boolean verifyBank(String mobile, String bankNum){

        return true;
    }

    public boolean withdraw(double b){
        if(b>balance){
            return false;
        }
        balance = balance - b;
        return true;
    }

    public void deposite(double b){
        balance = balance +b;
    }
}
