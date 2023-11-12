package UserData;

public class ElectronicPaymentCompanies extends Wallet {
    private String paymentCompany;

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
