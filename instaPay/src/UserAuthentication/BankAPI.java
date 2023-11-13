package UserAuthentication;

import UserData.Bank;

public class BankAPI {
    private static double balance = 10000;
    String url;

    BankAPI(String u){
        url = u;
    }


    public void setURL(String u){
        url = u;
    }


    public double inquireBalance(int bankNumber){
        return balance;
    }

    public boolean verifyBank(String mobile, String bankNum){

        return true;
    }

    public boolean withdraw(double b , int bankNumber){
        if(b>balance){
            return false;
        }
        balance = balance - b;
        return true;
    }

    public void deposite(double b , int bankNumber){
        balance = balance +b;
    }

}
