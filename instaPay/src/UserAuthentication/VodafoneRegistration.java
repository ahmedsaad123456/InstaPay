package UserAuthentication;

import API.VodafoneCashAPI;
import API.WalletAPI;
import UserData.VodafoneCashWallet;
import UserData.Wallet;

public class VodafoneRegistration extends WalletRegistration{

    @Override
    public Wallet createWalletAccount() {
        return new VodafoneCashWallet();
    }

    @Override
    public WalletAPI createWalletAPI() {
        return new VodafoneCashAPI("https://api-service.com/");
    }
}
