package BillManagment;

abstract class Bill {
    private double amount;

    public abstract void createBill();

    public boolean deductingFromAccount(double amount){
        return true;
    }
}
