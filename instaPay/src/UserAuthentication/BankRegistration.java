package UserAuthentication;

import UserData.User;

public class BankRegistration extends Registration{
    @Override
    public boolean specificSignUp(User userData) {
        return false;
    }
}
