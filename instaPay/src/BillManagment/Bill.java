package BillManagment;

import UserData.User;
import API.BillAPI;
public abstract class Bill {
    private double amount;
    private User user;

    public Bill(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }

    public abstract void createBill();

    public boolean deductingFromAccount(){
        if(user.getAccount().withdraw(amount)) {
            System.out.println("Amount $" + amount + " deducted from the account");
            return true;
        }
        System.out.println("Deduction failed");
        return false;
    }
}