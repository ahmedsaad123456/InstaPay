package UserAuthentication;

import UserData.User;
import UserData.UserDataBase;

import java.util.Scanner;
import java.util.regex.Pattern;



public class Verification {


    /**
     * check if the username is unique of not
     *
     * @param username is username input form the user
     * @return true if username is unique otherwise false
     */
    public boolean verifyUsername(String username)
    {

        UserDataBase db = new UserDataBase() ;
        return db.uniqueUsername(username);
    }
    /**
     * check if the instaAccount is unique of not
     *
     * @param instaAccount is username input form the user
     * @return true if instaAccount is unique otherwise false
     */
    public boolean verifyInstaAccount(String instaAccount)
    {


        UserDataBase db = new UserDataBase() ;
        return db.uniqueInstapayAccount(instaAccount);
    }
    /**
     * check if the password is valid or not
     *
     * @param password is the password of the user
     * @return true if password is valid otherwise false
     */
    public boolean verifyPassword(String password){
        Pattern p = Pattern.compile("[0-9|a-z|A-Z|!|@|#|$|&|%]{8,16}");
        if(!p.matcher(password).matches())
        {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("password is invalid , please enter a valid password in the following format: ");
            System.out.println("characters and numbers are allowed and this symbols: ");
            System.out.println("(! , @ , # , $ , & , %)");
            System.out.println("password must be in range 8-16");
            System.out.println("----------------------------------------------------------------------------------------");

            return false;
        }
        return true;
    }

    /**
     * check if phone number is valid or not and the user owns the mobile number or not
     *
     * @param mobileNumber is the mobile number of the user
     * @return true if the phone number is valid and he owns the mobile number otherwise false
     */
    public boolean verifyMobileNumber(String mobileNumber){

        UserDataBase db = new UserDataBase() ;
        if (!db.uniqueMobileNumber(mobileNumber)){
            System.out.println("mobile number is used before");
            return false;

        }

        Pattern p = Pattern.compile("((011)|(010)|(012)|(015)){1}[0-9]{8}");
        if (!p.matcher(mobileNumber).matches())
        {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("phone is invalid , please enter a valid phone in the following format: ");
            System.out.println("start with one of the following numbers: ");
            System.out.println("(011), (010) , (012) , (015)");
            System.out.println("and another 8 numbers");
            System.out.println("----------------------------------------------------------------------------------------");

            return false;
        }

        OTP otp = new OTP();


        if(otp.sendOTP()){
            int num;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the otp :  ");
            num = in.nextInt();
            in.nextLine();
            if(!otp.verifyOTP(num)){
                System.out.println("valid OTP");
                return false;
            }


        }
        else {
            System.out.println("Error : failure to send OTP");
            return false;
        }


        return true;
    }
}
