package UserAuthentication;

import API.CIBWalletAPI;
import API.WalletAPI;
import UserData.CIBWallet;
import UserData.Wallet;

public class CIBWalletRegistration extends WalletRegistration{
    @Override
    public Wallet createWalletAccount() {
        return new CIBWallet();
    }

    @Override
    public WalletAPI createWalletAPI() {
        return new CIBWalletAPI("https://api-service.com/");
    }
}
