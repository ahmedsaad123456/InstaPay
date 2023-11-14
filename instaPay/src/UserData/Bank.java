package UserData;

public abstract class Bank implements Account {
    String BankAccountNumber;

    public Bank() {
        BankAccountNumber = "";
    }

    public Bank(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public String getBankAccountNumber() {return BankAccountNumber;}

    public void setBankAccountNumber(String bankAccountNumber) {BankAccountNumber = bankAccountNumber;}

    @Override
    public double inquireBalance() { return 0; }

    @Override
    public boolean withdraw(double amount) { return false; }

    @Override
    public void deposit(double amount) { }

}
