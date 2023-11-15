package UserAuthentication;

import UserData.User;
import UserData.UserDataBase;

import java.util.Scanner;

public class Login {
    public boolean loginUser(String username, String password) {
        Scanner in = new Scanner(System.in);

        UserDataBase db = new UserDataBase();

        if(!db.checkUsername(username)){
            System.out.println("invalid username");
            return false;
        }

        while(true){
            if(!db.checkPassword(username , password)){
                char c;

                System.out.println("invalid password");
                System.out.println("Do you want to try again ? y/n");
                c = in.next().charAt(0);
                in.nextLine();

                if(c != 'y'){
                    return false;
                }
            } else {
                break;
            }
        }


        return true;


    }

    public User loadUser(String username){

        UserDataBase db = new UserDataBase();

        return db.getUser(username);



    }
}
