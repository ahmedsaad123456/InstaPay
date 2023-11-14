package UserAuthentication;

import UserData.User;

import java.util.Scanner;

abstract class Registration {
    public boolean signUp(User userData){
        String username , instaAccount , mobileNumber , password;
        Scanner in = new Scanner(System.in);
        Verification ver = new Verification();
        while(true){
            System.out.println("Enter your username");
            username = in.nextLine();
            if(!ver.verifyUsername(username)){
                char c;
                System.out.println("username is used before");
                System.out.println("Do you want to enter new username ? y/n");
                c = in.next().charAt(0);
                if(c != 'y'){
                    return false;
                }
            }
            else{
                break;
            }
        }
        userData.setUsername(username);

        while(true){
            System.out.println("Enter your password");
            password = in.nextLine();
            if(!ver.verifyPassword(password)){
                char c;
                System.out.println("password is not complex");
                System.out.println("Do you want to enter new password ? y/n");
                c = in.next().charAt(0);
                if(c != 'y'){
                    return false;
                }
            }
            else {
                break;
            }

        }

        userData.setPassword(password);

        while(true){
            System.out.println("Enter your mobile number");
            mobileNumber = in.nextLine();
            if(!ver.verifyMobileNumber(mobileNumber)){
                char c;
                System.out.println("Do you want to enter new mobile number ? y/n");
                c = in.next().charAt(0);
                if(c != 'y'){
                    return false;
                }
            }
            else {
                break;
            }

        }

        userData.setMobileNumber(mobileNumber);

        while(true){
            System.out.println("Enter your instapay account");
            instaAccount = in.nextLine();
            if(!ver.verifyInstaAccount(instaAccount)){
                char c;
                System.out.println("insta account is used before");
                System.out.println("Do you want to enter new insta account ? y/n");
                c = in.next().charAt(0);
                if(c != 'y'){
                    return false;
                }
            }
            else {
                break;
            }

        }

        userData.setInstapayAcoount(instaAccount);



        while (true){

            if(!specificSignUp(userData)){
                char c;
                System.out.println("invaild information");
                System.out.println("Do you want to enter again ? y/n");
                c = in.next().charAt(0);
                if(c != 'y'){
                    return false;
                }
            }
            else {
                break;
            }


        }


        return true;





    }

    public abstract boolean specificSignUp(User userData);
}
