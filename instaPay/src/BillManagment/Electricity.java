package BillManagment;

import UserData.User;
import API.ElectricityBillAPI;

public class Electricity extends Bill {

    private String electricityProvider;

    private String voltageType;

    private String electricityConsumption;
    public Electricity() {
        this.electricityProvider = "";
        this.voltageType = "";
        this.electricityConsumption = "";
    }

    public Electricity(double amount, String companyName, String electricityProvider, String voltageType, String electricityConsumption) {
        super(amount, companyName);
        this.electricityProvider = electricityProvider;
        this.voltageType = voltageType;
        this.electricityConsumption = electricityConsumption;
    }


    @Override
    public void createBill() {
        ElectricityBillAPI electricityBillAPI = new ElectricityBillAPI();
        electricityBillAPI.setURL("https://api-service.com/");
        Electricity bill = electricityBillAPI.getBill();

        System.out.println("Electricity bill created for user: " + getUser().getUsername());
        System.out.println("Company: " + bill.getCompanyName());
        System.out.println("Amount: $" + bill.getAmount());
        System.out.println("Provider: " + bill.electricityProvider);
        System.out.println("Voltage Type: " + bill.voltageType);
        System.out.println("Consumption: " + bill.electricityConsumption);
        bill.deductingFromAccount();
    }


}

