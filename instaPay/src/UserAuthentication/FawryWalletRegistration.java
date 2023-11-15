package UserAuthentication;

import API.FawryWalletAPI;
import API.WalletAPI;
import UserData.FawryWallet;
import UserData.Wallet;

public class FawryWalletRegistration extends WalletRegistration {

    @Override
    public WalletAPI createWalletAPI() {
        return new FawryWalletAPI("https://api-service.com/");
    }

    @Override
    public Wallet createWalletAccount() {
        return new FawryWallet();
    }
}
