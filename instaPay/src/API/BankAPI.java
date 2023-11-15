package API;

public abstract class BankAPI {
    protected static double balance = 10000;
    String url;

    public BankAPI(String u){
        url = u;
    }

    public BankAPI (){
        url = "";
    }


    public void setURL(String u){
        url = u;
    }


    public abstract double inquireBalance(String bankNumber ,String mobileNumber );

    public abstract boolean verifyMobileNumber(  String bankNumber , String mobile);
    public abstract boolean verifyBank(String BankNumber);

    public abstract boolean withdraw(double b , String bankNumber ,String mobileNumber);

    public abstract void deposit(double b , String bankNumber , String mobileNumber);
}
