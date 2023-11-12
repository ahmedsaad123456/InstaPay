package UserData;

public class BanksProvideWallets extends Wallet{

    String bankName;

    public BanksProvideWallets(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return bankName;
    }

//    public void setBankName(String bankName){
//        this.bankName = bankName;
//    }

    @Override
    public  boolean withdraw(double amount){
        //        BankBalance -= amount;
        // return true;
        return true;
    }
    public  boolean deposit(double amount){
        //        BankBalance += amount;
        //return true;
        return true;
    }
    public  double inquireBalance(String mobileNumber){
        // I should send this account number to bank api and bank api return the balance of this account number
        // and I store it in BankBalance here

        // WalletAPI wAPI = new WalletAPI(String mobileNumber);
        //super.setBalance(wAPI.getBalance());

        return 0.0;
    }
}
