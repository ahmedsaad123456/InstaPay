package UserData;

public class BanksProvideWallets extends Wallet{
    private String bankName;

    @Override
    public double inquireBalance() {
        return 0;
    }

    @Override
    public boolean withdraw() {
        return false;
    }

    @Override
    public boolean deposit() {
        return false;
    }
}
