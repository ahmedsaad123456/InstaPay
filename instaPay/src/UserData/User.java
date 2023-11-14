package  UserData;

public class User {
    private Account account;
    private String username;
    private String password;
    private String mobileNumber;
    private String instapayAcoount;

    public User() {
        username = "";
        password = "";
        mobileNumber = "";
        instapayAcoount = "";
        account = null;
    }

    public User(String username, String password, String mobileNumber, String instapayAcoountName, Account acc) {
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.instapayAcoount = instapayAcoountName;
        this.account = acc;
    }


    public Account getAccount() {return account;}

    public void setAccount(Account acc) {this.account = acc;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getMobileNumber() {return mobileNumber;}

    public void setMobileNumber(String mobileNumber) {this.mobileNumber = mobileNumber;}

    public String getInstapayAcoount() {
        return instapayAcoount;
    }

    public void setInstapayAcoount(String instapayAcoountName) {
        this.instapayAcoount = instapayAcoountName;
    }
}
