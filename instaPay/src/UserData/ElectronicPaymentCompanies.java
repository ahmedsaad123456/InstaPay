package UserData;


public class ElectronicPaymentCompanies extends Wallet{
    String paymentCompanyName;

    public ElectronicPaymentCompanies(String paymentCompanyName) {
        this.paymentCompanyName = paymentCompanyName;
    }

    public String getPaymentCompanyName() {
        return paymentCompanyName;
    }

//    public void setPaymentCompanyName(String paymentCompanyName) {
//        this.paymentCompanyName = paymentCompanyName;
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
