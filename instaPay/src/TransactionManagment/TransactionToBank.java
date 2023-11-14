package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToBank extends Transaction {
    public TransactionToBank(User user, double amount) {
        super(user, amount);
    }

    private Account createAccount(String bankName, String bankNumber){
        if(bankName == "Misr Bank"){
            return new MisrBank(bankNumber);
        }
        else if(bankName == "Alahly Bank"){
            return new AlahlyBank(bankNumber);
        }
        throw new Error("Invalid Bank");
    }
    private boolean checkValidity(Account account) {
//        if(account.checkAccount()){
//            return true;
//        }
        return false;
    }
    public boolean transfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Bank Name: ");
        String bankName = scanner.nextLine();
        System.out.println("Please enter Bank Number of the receiver: ");
        String bankNumber = scanner.nextLine();
        Account account = createAccount(bankName, bankNumber);
        if(checkValidity(account)){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        return false;
    }
}
