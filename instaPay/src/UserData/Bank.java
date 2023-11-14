package UserData;

public abstract class Bank extends Account {
   private String BankAccountNumber;

    public Bank() {
        BankAccountNumber = "";
    }

    public Bank(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public String getBankAccountNumber() {return BankAccountNumber;}

    public void setBankAccountNumber(String bankAccountNumber) {BankAccountNumber = bankAccountNumber;}

}
