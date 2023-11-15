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

    public int loadTransactionMenu() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Transfer Menu:");
        System.out.println("1. Transfer to Wallet");
        System.out.println("2. Transfer to Instapay Account");
        System.out.println("Enter another numbers to exit");
        System.out.println("Enter your choice (1-2): ");
        System.out.println("----------------------------------------------------------------------------------------");


        return 2;
    }
}
