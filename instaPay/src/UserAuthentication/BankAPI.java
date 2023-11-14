package UserAuthentication;

import UserData.Bank;

public class BankAPI {
    private static double balance = 10000;
    String url;

    public BankAPI(String u){
        url = u;
    }


    public void setURL(String u){
        url = u;
    }


    public double inquireBalance(String bankNumber, String mobile){
        return balance;
    }

    public boolean verifyBank(String mobile, String bankNum){

        return true;
    }

    public boolean withdraw(double b , String bankNumber, String mobile){
        if(b>balance){
            return false;
        }
        balance = balance - b;
        return true;
    }

    public void deposite(double b , String bankNumber, String mobile){
        balance = balance +b;
    }

}
