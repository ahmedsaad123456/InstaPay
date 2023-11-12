package UserData;

abstract public class Account {
    private double balance;

    public abstract double inquireBalance();

    public abstract boolean withdraw();

    public abstract boolean deposit();
}
