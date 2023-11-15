package UserAuthentication;

import API.BankAPI;
import API.WalletAPI;
import UserData.Bank;
import UserData.User;
import UserData.UserDataBase;
import UserData.Wallet;

import java.util.Scanner;

public abstract class WalletRegistration extends Registration{
    @Override
    public boolean specificSignUp(User userData , String mobileNumber)
    {

        WalletAPI w = createWalletAPI();
        UserDataBase Udb = new UserDataBase();

        if(!w.verifyWallet(mobileNumber)){
            System.out.println("the mobile number is not related to any wallet");
            return false;
        }

        Wallet wallet = createWalletAccount();

        wallet.setMobileNumber(mobileNumber);
        userData.setAccount(wallet);

        Udb.saveUser(userData);

        return true;

    }

    public abstract Wallet createWalletAccount();
    public abstract WalletAPI createWalletAPI();
}
