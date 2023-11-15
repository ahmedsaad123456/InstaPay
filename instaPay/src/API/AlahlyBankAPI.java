package API;

public class AlahlyBankAPI extends BankAPI{

    public AlahlyBankAPI(String url){
        super(url);
    }
    @Override
    public double inquireBalance(String bankNumber ,String mobileNumber) {
        return balance;
    }

    @Override
    public boolean verifyMobileNumber( String bankNumber ,String mobile) {
        return true;
    }

    @Override
    public boolean verifyBank(String BankNumber) {
        return true;
    }

    @Override
    public boolean withdraw(double b , String bankNumber ,  String mobileNumber){
        if(b>balance){
            return false;
        }
        balance = balance - b;
        return true;
    }

    @Override
    public void deposit(double b ,  String bankNumber , String mobileNumber){
        balance = balance +b;
    }
}
