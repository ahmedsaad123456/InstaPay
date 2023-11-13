package UserAuthentication;

import UserData.User;

public class WalletRegistration extends Registration{
    @Override
    public boolean specificSignUp(User userData)
    {
        return false;
    }
}
