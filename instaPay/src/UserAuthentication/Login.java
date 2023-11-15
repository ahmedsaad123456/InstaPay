package UserAuthentication;

import UserData.User;
import UserData.UserDataBase;

import java.util.Scanner;

public class Login {
    public boolean loginUser(String username, String password) {
        Scanner in = new Scanner(System.in);

        UserDataBase db = new UserDataBase();

        if(!db.checkUsername(username)){//check if username exists
            System.out.println("Username does not exist");
            return false;
        }

        while(true){//check if password is correct
            if(!db.checkPassword(username , password)){
                char c;

                System.out.println("invalid password");
                c = in.next().charAt(0);
                in.nextLine();

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
