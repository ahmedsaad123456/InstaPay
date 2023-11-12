package  UserData;

abstract class User {
    public User() {
        username = "";
        password = "";
        mobileNumber = "";
        email = "";
        instapayAcoountName = "";
    }

    public User(String username, String password, String mobileNumber, String email, String instapayAcoountName) {
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.instapayAcoountName = instapayAcoountName;
    }

    String username;
    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}


    String password;
    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}


    String mobileNumber;
    public String getMobileNumber() {return mobileNumber;}

    public void setMobileNumber(String mobileNumber) {this.mobileNumber = mobileNumber;}


    String email;
    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}


    String instapayAcoountName;
    public String getInstapayAcoountName() {return instapayAcoountName;}

    public void setInstapayAcoountName(String instapayAcoountName) {this.instapayAcoountName = instapayAcoountName;}


}
