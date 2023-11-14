package UserData;

public abstract class Wallet extends Account{
    private String walletName;

    public Wallet() {
        walletName = "";
    }
    public Wallet(String walletName) {
        this.walletName = walletName;
    }

    public String getWalletName() {return walletName;}

    public void setWalletName(String walletName) {this.walletName = walletName;}

    public abstract boolean verifyAccount();

}
