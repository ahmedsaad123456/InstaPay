package UserData;

import javax.management.remote.SubjectDelegationPermission;

public class BankUser extends User {
    public BankUser() {
        super();
    }

    public BankUser(String username, String password, String instapayAcoountName, Account acc) {
        super(username, password, instapayAcoountName, acc);
    }

    @Override
    public void loadAccountProfile() {
        Bank b = (Bank) this.getAccount();
        System.out.println("Bank name : " + b.getBankName());
        System.out.println("Bank Number : " + b.getBankAccountNumber());
    }

    @Override
    public int loadTransactionMenu() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Transfer Menu:");
        System.out.println("1. Transfer to Wallet");
        System.out.println("2. Transfer to Instapay Account");
        System.out.println("3. Transfer to Bank");
        System.out.println("Enter another numbers to exit");
        System.out.println("Enter your choice (1-3): ");
        System.out.println("----------------------------------------------------------------------------------------");


        return 3;
    }
}
