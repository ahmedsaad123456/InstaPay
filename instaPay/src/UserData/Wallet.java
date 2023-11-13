package UserData;
import UserAuthentication.BankAPI;
import UserAuthentication.WalletAPI;

public abstract class Wallet implements Account{

    String walletName;

    public Wallet() {
        walletName = "";
    }
    public Wallet(String walletName) {
        this.walletName = walletName;
    }


    public String getWalletName() {return walletName;}

    public void setWalletName(String walletName) {this.walletName = walletName;}


    //  the following functions are not competed yet

    @Override
    public double inquireBalance() {  // need api
        // I should send this account number to bank api and bank api return the balance of this account number
        // and I store it in BankBalance here

        // BankAPI bAPI = new BankAPI(String BAccountNumber);
        //BankBalance = bAPI.getBalance();
        return 0;
    }

    @Override
    public boolean withdraw(double amount) { // need api
        //        BankBalance -= amount;
//        return true;
        return false;
    }

    @Override
    public boolean deposit(double amount) { // need api
        //        BankBalance += amount;
//        return true;



        return false;
    }


    //WalletAPI wAPI = new WalletAPI(String mobileNumber);
    //balance = wAPI.getBalance();
    //  return walletBalance;


}
