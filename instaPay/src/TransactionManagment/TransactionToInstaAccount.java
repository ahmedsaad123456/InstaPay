package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToInstaAccount extends Transaction {
    public TransactionToInstaAccount(User user, double amount) {
        super(user, amount);
    }

    public boolean transfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Instapay account of the receiver: ");
        String instapayAccount = scanner.nextLine();
        Account account = createAccount(instapayAccount);
        if(checkValidity(account)){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        return false;
    }
    private Account createAccount(String instapayAccount){

        return new MisrBank();
    }
    private boolean checkValidity(Account account) {
//        if(account.checkAccount()){
//            return true;
//        }
        return false;
    }
}
