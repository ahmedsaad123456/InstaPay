package API;

public abstract class WalletAPI {
    protected static double balance = 10000;
    String url;

    public WalletAPI(String u){
        url = u;
    }

    public WalletAPI(){
        url = "";
    }

    public void setURL(String u){
        url = u;
    }


    public abstract double inquireBalance(String mobileNumber);

    public abstract boolean verifyWallet(String mobileNumber);

    public abstract boolean withdraw(double b , String mobileNumber);

    public abstract void deposit(double b , String mobileNumber);
}
