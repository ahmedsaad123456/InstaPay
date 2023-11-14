package UserData;

public interface Account {
    public User user = new User();
    public  double inquireBalance();
    public  boolean withdraw(double amount);
    public  void deposit(double amount);

}
