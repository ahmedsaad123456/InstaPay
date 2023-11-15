package BillManagment;

import API.GasBillAPI;
import API.WaterBillAPI;
public class Water extends Bill {
    private String waterProvider;
    private String meterSize;
    private String waterConsumption;
    public Water() {
        this.waterProvider = "";
        this.meterSize = "";
        this.waterConsumption = "";
    }

    public Water(double amount, String companyName,String waterProvider, String meterSize, String waterConsumption) {
        super(amount, companyName);
        this.waterProvider = waterProvider;
        this.meterSize = meterSize;
        this.waterConsumption = waterConsumption;
    }

    @Override
    public void createBill() {
        WaterBillAPI waterBillAPI = new WaterBillAPI();
        waterBillAPI.setURL("https://api-service.com/");
        Water bill = waterBillAPI.getBill();


        this.setAmount(bill.getAmount());

        System.out.println("Water bill created for user: " + getUser().getUsername());
        System.out.println("Company: " + bill.getCompanyName());
        System.out.println("Amount: $" + bill.getAmount());
        System.out.println("Provider: " + bill.waterProvider);
        System.out.println("Meter Size: " + bill.meterSize);
        System.out.println("Consumption: " + bill.waterConsumption);
        deductingFromAccount();

    }
}


