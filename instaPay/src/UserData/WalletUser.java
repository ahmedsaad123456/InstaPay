package UserData;

public class WalletUser extends User {
    public WalletUser() {
        super();
    }

    public WalletUser(String username, String password, String mobileNumber, String instapayAcoountName, Account acc) {
        super(username, password, mobileNumber, instapayAcoountName, acc);
    }
}
