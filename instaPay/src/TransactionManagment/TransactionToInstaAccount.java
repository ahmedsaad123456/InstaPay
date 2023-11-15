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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Instapay account of the receiver: ");
        String instapayAccount = scanner.nextLine();
        Account account = createAccount(instapayAccount);
        if(senderUser.getInstapayAcoount().equals(instapayAccount)){
            System.out.println("Can't transfer money to yourself");
            return false;
        }
        if(account!=null && account.verifyAccount()){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        System.out.println("Invalid account");
        return false;
    }
    private Account createAccount(String instapayAccount){
        UserDataBase userDataBase = new UserDataBase();
        if(userDataBase.checkInstapayAccount(instapayAccount)){
            return userDataBase.getUserByInstaAccount(instapayAccount).getAccount();
        }
        else{
            return null;
        }
    }
}
