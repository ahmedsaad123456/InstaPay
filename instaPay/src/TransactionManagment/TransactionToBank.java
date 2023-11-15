package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToBank extends Transaction {
    public TransactionToBank(User user, double amount) {
        super(user, amount);
    }

    private Account createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your bank from the following");
        System.out.println("( Alahly   ,  Misr  )");
        String bankName = scanner.nextLine();

        Bank bank = new BankFactory().createBank(bankName);

        if (bank == null) {
            System.out.println("invalid provider name");
            System.out.println("Enter the name of receiver's provider from the following");
            System.out.println("( Vodafone   ,  CIB   , Fawry  )");
            scanner.nextLine();
            bank = new BankFactory().createBank(bankName);
        }
        System.out.println("Please enter Bank Number of the receiver: ");
        String bankNumber = scanner.nextLine();
        bank.setBankAccountNumber(bankNumber);
        return bank;
    }
    public boolean transfer(){
        if(amount > senderUser.getAccount().inquireBalance()){
            System.out.println("Insufficient balance");
            return false;
        }
        Account account = createAccount();
        if(account.verifyAccount()){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        System.out.println("Invalid account");
        return false;
    }
}
