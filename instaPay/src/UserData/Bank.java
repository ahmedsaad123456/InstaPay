package UserData;

public class Bank extends Account{
    private String bankAccountNumber;
    private String name;
    private String branchName;

    public double inquireBalance() {
        return 0;
    }

    public boolean withdraw() {
        return false;
    }

    public boolean deposit() {
        return false;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
