package UserData;

public class BanksProvideWallets extends Wallet{

    String bankName;

    public BanksProvideWallets() {this.bankName = "";}

    public BanksProvideWallets(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return bankName;
    }

//    public void setBankName(String bankName){
//        this.bankName = bankName;
//    }

//  the following functions are not competed yet

    @Override
    public double inquireBalance() {  // need api
        // I should send this account number to bank api and bank api return the balance of this account number
        // and I store it in BankBalance here

        // BankAPI bAPI = new BankAPI(String BAccountNumber);
        //BankBalance = bAPI.getBalance();
        return 0;
    }

    @Override
    public boolean withdraw(double amount) { // need api
        //        BankBalance -= amount;
//        return true;
        return false;
    }

    @Override
    public boolean deposit(double amount) { // need api
        //        BankBalance += amount;
//        return true;



        return false;
    }


    //WalletAPI wAPI = new WalletAPI(String mobileNumber);
    //balance = wAPI.getBalance();
    //  return walletBalance;

}
