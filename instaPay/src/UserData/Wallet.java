package UserData;

import API.WalletAPI;

public abstract class Wallet extends Account{
    private String walletProvider;

    private WalletAPI walletAPI;

    public Wallet() {
        walletProvider = "";
    }
    public Wallet(String walletProvider) {
        this.walletProvider = walletProvider;
    }

    public String getWalletProvider() {return walletProvider;}

    public void setWalletProvider(String walletName) {this.walletProvider = walletName;}

    public void setWalletAPI(WalletAPI walletAPI) {
        this.walletAPI = walletAPI;
    }

    public WalletAPI getWalletAPI() {
        return walletAPI;
    }

    public abstract boolean verifyAccount();

}
