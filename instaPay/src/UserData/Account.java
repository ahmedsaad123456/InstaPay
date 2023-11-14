package UserData;

public abstract class  Account {
    private String mobileNumber;
    public String getMobileNumber() {return mobileNumber;}

    public void setMobileNumber(String mobileNumber) {this.mobileNumber = mobileNumber;}

    Account(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    Account(){
     this.mobileNumber = "0000000000";
    }
    public abstract double  inquireBalance();
    public abstract boolean withdraw(double amount);
    public abstract void deposit(double amount);

    public abstract boolean verifyAccount();

}
