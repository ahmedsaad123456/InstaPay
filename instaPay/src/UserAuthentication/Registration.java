package UserAuthentication;

import UserData.User;

abstract class Registration {
    public boolean signUp(User userData){
        return false;
    }

    public abstract boolean specificSignUp(User userData);
}
