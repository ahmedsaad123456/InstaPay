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
}
