package UserData;

public abstract class Wallet extends Account {
    private String walletName;

    public abstract double inquireBalance();
    public abstract boolean withdraw();
    public abstract boolean deposit();
}
