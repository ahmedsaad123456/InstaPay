package UserAuthentication;

import API.BankAPI;
import API.WalletAPI;
import UserData.*;

import java.util.Scanner;

public class WalletRegistration extends Registration{
    @Override
    public boolean specificSignUp(User userData , String mobileNumber)
    {
        String providerName;
        WalletFactory f = new WalletFactory();
        Scanner in = new Scanner(System.in);
        Wallet wallet;
        while(true) {
            System.out.println("Enter the name of your provider from the following");
            System.out.println("( Vodafone   ,  CIB   , Fawry  )");
            providerName = in.nextLine();

            wallet = f.createWallet(providerName);

            if (wallet == null) {
                System.out.println("invalid provider name");
                char c;
                System.out.println("Do you want to enter again ? y/n");
                c = in.next().charAt(0);
                in.nextLine();
                if(c != 'y'){
                    return false;
                }
            }
            else{
                break;
            }
        }

        WalletAPI w = wallet.getWalletAPI();
        UserDataBase Udb = new UserDataBase();

        if(!w.verifyWallet(mobileNumber)){
            System.out.println("the mobile number is not related to any wallet");
            return false;
        }


        wallet.setMobileNumber(mobileNumber);
        userData.setAccount(wallet);

        Udb.saveUser(userData);

        return true;

    }


}
