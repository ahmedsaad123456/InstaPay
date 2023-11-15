package UserData;

import API.BankAPI;

public abstract class Bank extends Account {
   private String bankAccountNumber;

   private BankAPI bankAPI;
   private String bankName;

    public Bank() {
        bankAccountNumber = "";
        bankName ="";
    }

    public Bank(String bankAccountNumber , String bankName) {
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }


    public void setBankAPI(BankAPI bankAPI){
        this.bankAPI = bankAPI;
    }

    public BankAPI getBankAPI(){
        return bankAPI;
    }

    public String getBankAccountNumber() {return bankAccountNumber;}

    public void setBankAccountNumber(String bankAccountNumber) {this.bankAccountNumber = bankAccountNumber;}

    public String getBankName(){return bankName; }

    public void setBankName(String bankName){this.bankName = bankName;}

}
