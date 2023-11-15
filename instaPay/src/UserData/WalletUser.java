package UserData;

public class WalletUser extends User {
    public WalletUser() {
        super();
    }

    public WalletUser(String username, String password, String instapayAcoountName, Account acc) {
        super(username, password,  instapayAcoountName, acc);
    }

    @Override
    public void loadAccountProfile() {
        Wallet w = (Wallet) this.getAccount();
        System.out.println("Wallet Provider : " + w.getWalletProvider());
    }
}
