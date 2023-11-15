package UserData;

public class WalletFactory {
    public Wallet createWallet(String walletName){
        if(walletName.equals("Vodafone")){
            return new VodafoneCashWallet();
        }
        else if (walletName.equals("CIB")){
            return new CIBWallet();
        }
        else if (walletName.equals("Fawry")){
            return new FawryWallet();
        }

        return null;
    }
}
