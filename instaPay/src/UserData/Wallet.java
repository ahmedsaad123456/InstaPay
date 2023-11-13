package UserData;

public abstract class Wallet {

    public Wallet() {
        this.walletBalance = 0.0;
//        this.walletName = "";
    }

    public Wallet(double balance) {
        this.walletBalance = balance;
        //this.walletName = walletName;
    }



//    String walletName;
//    public String getWalletName() {
//        return walletName;
//    }
//
//    public void setWalletName(String walletName) {
//        this.walletName = walletName;
//    }

    double walletBalance;
    public double getBalance() {
        return walletBalance;
    }

    public void setBalance(double balance) {
        this.walletBalance = balance;
    }

    public abstract boolean withdraw(double amount);
    public abstract boolean deposit(double amount);

    public abstract double inquireBalance(String mobileNumber);


    //WalletAPI wAPI = new WalletAPI(String mobileNumber);
    //balance = wAPI.getBalance();
    //  return walletBalance;


}
