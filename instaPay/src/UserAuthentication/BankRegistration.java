package UserAuthentication;

import API.BankAPI;
import UserData.*;

import java.util.Scanner;

public abstract class BankRegistration extends Registration{
    @Override
    public boolean specificSignUp(User userData , String mobileNumber) {
        String bankNumber;
        BankAPI b = createBankAPI();
        UserDataBase Udb = new UserDataBase();
        Scanner in = new Scanner(System.in);
        System.out.println("enter your bank number");
        bankNumber = in.nextLine();
        if(!b.verifyMobileNumber(bankNumber , mobileNumber)){
            System.out.println("the bank number is not matched with your mobile number");
            return false;
        }

        Bank bank = createBankAccount();

        bank.setBankAccountNumber(bankNumber);
        bank.setMobileNumber(mobileNumber);
        userData.setAccount(bank);

        Udb.saveUser(userData);





        return true;



    }

    public abstract Bank createBankAccount();
    public abstract BankAPI createBankAPI();

}
