package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToWallet extends Transaction {
    public TransactionToWallet(User user, double amount) {
        super(user, amount);
    }


    private Account createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of receiver's provider from the following");
        System.out.println("( Vodafone   ,  CIB   , Fawry  )");
        String WalletName = scanner.nextLine();

        Wallet wallet = new WalletFactory().createWallet(WalletName);

        while (wallet == null) {
            System.out.println("invalid provider name");
            System.out.println("Enter the name of receiver's provider from the following");
            System.out.println("( Vodafone   ,  CIB   , Fawry  )");
            scanner.nextLine();
            wallet = new WalletFactory().createWallet(WalletName);
        }
        System.out.println("Please enter mobile number of the receiver: ");
        String walletNumber = scanner.nextLine();
        wallet.setMobileNumber(walletNumber);
        return wallet;
    }
    public boolean transfer(){
        if(amount > senderUser.getAccount().inquireBalance()){
            System.out.println("Insufficient balance");
            return false;
        }
        Account account = createAccount();
        if(account.getMobileNumber().equals(senderUser.getAccount().getMobileNumber())){
            System.out.println("Can't transfer money to yourself");
            return false;
        }
        if(account.verifyAccount()){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        System.out.println("Invalid account");
        return false;
    }
}
