package BillManagment;

import UserData.User;

public class Electricity extends Bill {

    private String electricityProvider;

    private String voltageType;

    private String electricityConsumption;

    public Electricity(double amount, String electricityProvider, String voltageType, String electricityConsumption) {
        super(amount);
        this.electricityProvider = electricityProvider;
        this.voltageType = voltageType;
        this.electricityConsumption = electricityConsumption;
    }


    @Override
    public void createBill() {
        Electricity bill = BillAPI.getElectricityBill();

        System.out.println("Electricity bill created for user: " + getUser().getUsername());
        System.out.println("Amount: $" + bill.getAmount());
        System.out.println("Provider: " + bill.electricityProvider);
        System.out.println("Voltage Type: " + bill.voltageType);
        System.out.println("Consumption: " + bill.electricityConsumption);
        bill.deductingFromAccount();
    }


}

