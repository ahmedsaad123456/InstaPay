package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToWallet extends Transaction {
    public TransactionToWallet(User user, double amount) {
        super(user, amount);
    }

    private Account createAccount(String walletName, String mobileNumber) {
        switch (walletName) {
            case "Vodafone Cash" -> {
                return new TelecommunicationCompanies(mobileNumber);
            }
            case "Fawry Wallet" -> {
                return new ElectronicPaymentCompanies(mobileNumber);
            }
            case "CIB Wallet" -> {
                return new BanksProvideWallets(mobileNumber);
            }
        }
        throw new Error("Invalid Wallet");
    }
    public boolean transfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter wallet name: ");
        String walletName = scanner.nextLine();
        System.out.println("Please enter mobile number of the receiver: ");
        String mobile = scanner.nextLine();
        Account account = createAccount(walletName, mobile);
        if(account.verifyAccount()){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        return false;
    }
}
