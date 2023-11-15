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

        if(!db.checkPassword(username , password)){

            System.out.println("invalid password");
            return false;

        }

        return true;


    }

    public User loadUser(String username){

        UserDataBase db = new UserDataBase();

        return db.getUser(username);



    }
}
