package UserAuthentication;

import API.BankAPI;
import UserData.*;

import java.util.Scanner;

public class BankRegistration extends Registration{
    @Override
    public boolean specificSignUp(User userData , String mobileNumber) {
        String bankNumber , bankName;
        BankFactory f = new BankFactory();
        UserDataBase Udb = new UserDataBase();
        Scanner in = new Scanner(System.in);


        Bank bank;
        while(true) {
            System.out.println("Enter the name of your bank from the following");
            System.out.println("( Alahly   ,  Misr  )");
            bankName = in.nextLine();

            bank = f.createBank(bankName);

            if (bank == null) {
                System.out.println("invalid bank name");
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


        BankAPI b = bank.getBankAPI();



        System.out.println("enter your bank number");
        bankNumber = in.nextLine();
        if(!b.verifyMobileNumber(bankNumber , mobileNumber)){
            System.out.println("the bank number is not matched with your mobile number");
            return false;
        }


        bank.setBankAccountNumber(bankNumber);
        bank.setMobileNumber(mobileNumber);
        userData.setAccount(bank);

        Udb.saveUser(userData);





        return true;



    }



}
