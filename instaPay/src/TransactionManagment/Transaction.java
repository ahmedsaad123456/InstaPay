package TransactionManagment;

import UserData.Account;
import UserData.User;

abstract class Transaction {
    protected double amount;
    protected User senderUser;
    public Transaction(User user, double amount){
        this.senderUser = user;
        this.amount = amount;
    }
    public abstract boolean transfer();
}
