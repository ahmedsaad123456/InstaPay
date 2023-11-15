package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToInstaAccount extends Transaction {
    public TransactionToInstaAccount(User user, double amount) {
        super(user, amount);
    }

    public boolean transfer(){
        if(amount > senderUser.getAccount().inquireBalance()){
            System.out.println("Insufficient balance");
            return false;
        }
        Account account = createAccount();
        if(account!=null && account.verifyAccount()){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        System.out.println("Invalid account");
        return false;
    }
    private Account createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Instapay account of the receiver: ");
        String instapayAccount = scanner.nextLine();
        UserDataBase userDataBase = new UserDataBase();
        if(userDataBase.checkInstapayAccount(instapayAccount)){
            return userDataBase.getUserByInstaAccount(instapayAccount).getAccount();
        }
        else{
            return null;
        }
    }
}
