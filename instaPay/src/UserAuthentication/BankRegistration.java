package UserAuthentication;

import UserData.Bank;
import UserData.User;

import java.util.Scanner;

public class BankRegistration extends Registration{
    @Override
    public boolean specificSignUp(User userData) {
        String bankNumber , bankName;
        BankAPI b = new BankAPI();
        Scanner in = new Scanner(System.in);
        System.out.println("enter your bank number");
        bankNumber = in.nextLine();
        if(!b.verifyBank(userData.getMobileNumber() , bankNumber)){
            System.out.println("the bank number is not matched with your mobile number");
            return false;
        }

        Bank bank;

        System.out.println("enter your bank name from(Misr - Alahly) : ");
        bankName = in.nextLine();
        if(bankName.equals("Misr")){
//             bank = new MisrBank();
        } else if (bankName.equals("Alahly")) {
//            bank = new AlahlyBank();
        }
        else{
            System.out.println("the " + bankName + "is not one of this(Misr - Alahly)");
            return false;
        }

//        bank.setBankAccountNumber(bankNumber);
//        userData.set



        return true;



    }
}
