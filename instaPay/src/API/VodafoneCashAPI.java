package API;

public class VodafoneCashAPI extends WalletAPI{

    public VodafoneCashAPI(String url){
        super(url);
    }
    @Override
    public double inquireBalance(String mobileNumber) {
        return balance;
    }


    @Override
    public boolean verifyWallet(String mobileNumber) {
        return true;
    }

    @Override
    public boolean withdraw(double b , String mobileNumber){
        if(b>balance){
            return false;
        }
        balance = balance - b;
        return true;
    }

    @Override
    public void deposit(double b , String mobileNumber){
        balance = balance +b;
    }
}
