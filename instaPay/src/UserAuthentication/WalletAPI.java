package UserAuthentication;

import UserData.ElectronicPaymentCompanies;
import UserData.Wallet;

public class WalletAPI {
    public Wallet loadAccount(String mobileNumber){
        return new ElectronicPaymentCompanies();
    }

    public boolean verifyWallet(String mobile, String provider) {
        return false;
    }
}
