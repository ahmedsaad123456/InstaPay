package UserData;

public class TelecommunicationCompanies extends Wallet {
    private String telecomProvider;

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
