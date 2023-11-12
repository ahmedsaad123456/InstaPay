package UserData;

public abstract class Wallet {
    private double balance;
    private String walletName;

    public abstract double inquireBalance();
    public abstract boolean withdraw();
    public abstract boolean deposit();
}
