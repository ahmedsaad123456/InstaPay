package UserData;

public class User {
    private String username;
    private String password;
    private String mobileNumber;
    private String instapayAccount;
    private String email;
    private Account account;

    public String getInstapayAccount() {
        return instapayAccount;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Account getAccount() {
        return account;
    }
}
