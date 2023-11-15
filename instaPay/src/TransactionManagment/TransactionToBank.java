package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToBank extends Transaction {
    public TransactionToBank(User user, double amount) {
        super(user, amount);
    }

    private Account createAccount(String bankName, String bankNumber){
        switch (bankName) {
            case "Misr Bank" -> {
                return new MisrBank(bankNumber);
            }
            case "Alahly Bank" -> {
                return new AlahlyBank(bankNumber);
            }
        }
        throw new Error("Invalid Bank");
    }
    public boolean transfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Bank Name: ");
        String bankName = scanner.nextLine();
        System.out.println("Please enter Bank Number of the receiver: ");
        String bankNumber = scanner.nextLine();
        Account account = createAccount(bankName, bankNumber);
        if(account.verifyAccount()){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        return false;
    }
}
