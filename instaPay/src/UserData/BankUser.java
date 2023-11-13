package UserData;

import javax.management.remote.SubjectDelegationPermission;

public class BankUser extends User {
    public BankUser() {
        super();
    }

    public BankUser(String username, String password, String mobileNumber, String instapayAcoountName, Account acc) {
        super(username, password, mobileNumber, instapayAcoountName, acc);
    }
//    public BankUser(Account a){
//        super(a);
//    }
}
