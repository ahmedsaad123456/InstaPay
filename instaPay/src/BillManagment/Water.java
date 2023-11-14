package BillManagment;

import UserData.User;
public class Water extends Bill {
    private String waterProvider;
    private String meterSize;
    private String waterConsumption;

    public Water(double amount, String waterProvider, String meterSize, String waterConsumption) {
        super(amount);
        this.waterProvider = waterProvider;
        this.meterSize = meterSize;
        this.waterConsumption = waterConsumption;
    }

    @Override
    public void createBill() {
        Water bill = BillAPI.getWaterBill();

        System.out.println("Water bill created for user: " + getUser().getUsername());
        System.out.println("Amount: $" + bill.getAmount());
        System.out.println("Provider: " + bill.waterProvider);
        System.out.println("Meter Size: " + bill.meterSize);
        System.out.println("Consumption: " + bill.waterConsumption);
        bill.deductingFromAccount();

    }
}


