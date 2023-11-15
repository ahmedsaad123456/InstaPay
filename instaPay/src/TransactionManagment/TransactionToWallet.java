package TransactionManagment;

import UserData.*;

import java.util.Scanner;

public class TransactionToWallet extends Transaction {
    public TransactionToWallet(User user, double amount) {
        super(user, amount);
    }

    private Account createAccount(String walletName, String mobileNumber) {
        if(walletName == "Vodafone Cash"){
            return new VodafoneCashWallet(mobileNumber);
        }
        else if(walletName == "Fawry Wallet"){
            return new FawryWallet(mobileNumber);
        }
        else if(walletName == "CIB Wallet"){
            return new CIBWallet(mobileNumber);
        }
        throw new Error("Invalid Wallet");
    }

    private boolean checkValidity(Account account) {
//        if(account.checkAccount()){
//            return true;
//        }
        return false;
    }
    public boolean transfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter wallet name: ");
        String walletName = scanner.nextLine();
        System.out.println("Please enter mobile number of the receiver: ");
        String mobile = scanner.nextLine();
        Account account = createAccount(walletName, mobile);
        if(checkValidity(account)){
            senderUser.getAccount().withdraw(amount);
            account.deposit(amount);
            return true;
        }
        return false;
    }
}
