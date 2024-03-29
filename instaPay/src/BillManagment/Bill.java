package BillManagment;

import UserData.User;
import API.BillAPI;
public abstract class Bill {
    private double amount;
    private String companyName;
    private User user = null;

    public Bill() {
        this.amount = 0.0;
        this.companyName = "";
    }
    public Bill(double amount, String name) {

        this.amount = amount;
        this.companyName = name;
    }

    public double getAmount() {
        return amount;
    }
    public String getCompanyName() {
        return companyName;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User u) {
        user = u;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void createBill(String numberOfReceipt);

    public boolean deductingFromAccount(){
        if(user.getAccount().withdraw(amount)) {
            System.out.println("Amount $" + amount + " deducted from the account");
            return true;
        }
        System.out.println("Deduction failed");
        return false;
    }
}