package UserData;

public abstract class Wallet implements Account{
    private String walletName;

    public Wallet() {
        walletName = "";
    }
    public Wallet(String walletName) {
        this.walletName = walletName;
    }

    public String getWalletName() {return walletName;}

    public void setWalletName(String walletName) {this.walletName = walletName;}

    @Override
    public double inquireBalance() {return 0.0;}

    @Override
    public boolean withdraw(double amount) {return false;}

    @Override
    public void deposit(double amount){}

}
