package UserData;

public class TelecommunicationCompanies extends Wallet {

    String telecomProviderName;

    public TelecommunicationCompanies() {this.telecomProviderName = "";}

    public TelecommunicationCompanies(String telecomProviderName) {
        this.telecomProviderName = telecomProviderName;
    }

    public String getTelecomProviderName() {
        return telecomProviderName;
    }

//    public void setTelecomProviderName(String telecomProviderName){
//        this.telecomProviderName = telecomProviderName;
//    }

    @Override
    public boolean withdraw(double amount) {
        //        BankBalance -= amount;
        // return true;
        return true;
    }

    public boolean deposit(double amount) {
        //        BankBalance += amount;
        //return true;
        return true;
    }

    public double inquireBalance(String mobileNumber) {
        // I should send this account number to bank api and bank api return the balance of this account number
        // and I store it in BankBalance here

        // WalletAPI wAPI = new WalletAPI(String mobileNumber);
        //super.setBalance(wAPI.getBalance());

        return 0.0;
    }
}
//
//public class TelecommunicationCompanies extends Wallet {
//    private String telecomProvider;
//
//    @Override
//    public double inquireBalance() {
//        return 0;
//    }
//
//    @Override
//    public boolean withdraw() {
//        return false;
//    }
//
//    @Override
//    public boolean deposit() {
//        return false;
//    }
//
//}
