package  UserData;

import BillManagment.Bill;

import java.util.ArrayList;

public abstract class User {
    private Account account;
    private String username;
    private String password;
    private String instapayAcoount;


    public User() {
        username = "";
        password = "";
        instapayAcoount = "";
        account = null;
    }

    public User(String username, String password, String instapayAcoountName, Account acc) {
        this.username = username;
        this.password = password;
        this.instapayAcoount = instapayAcoountName;
        this.account = acc;
    }


    public Account getAccount() {return account;}

    public void setAccount(Account acc) {this.account = acc;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}



    public String getInstapayAcoount() {
        return instapayAcoount;
    }

    public void setInstapayAcoount(String instapayAcoountName) {
        this.instapayAcoount = instapayAcoountName;
    }

    public void loadProfile(){
        System.out.println("Username : "+ username);
        System.out.println("instapay Account : " + instapayAcoount);
        System.out.println("Mobile Number : " + getAccount().getMobileNumber());
        loadAccountProfile();
    }
    public abstract void loadAccountProfile();
}
