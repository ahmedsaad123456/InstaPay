package BillManagment;

import UserData.User;
import API.GasBillAPI;

public class Gas extends Bill {

    private String gasProvider;

    private String connectionType;

    private String gasConsumption;
    public Gas(double amount, String gasProvider, String connectionType, String gasConsumption) {
        super(amount);
        this.gasProvider = gasProvider;
        this.connectionType = connectionType;
        this.gasConsumption = gasConsumption;
    }


    @Override
    public void createBill() {
        GasBillAPI gasBillAPI = new GasBillAPI();
        Gas bill = gasBillAPI.getBill();

        System.out.println("Gas bill created for user: " + getUser().getUsername());
        System.out.println("Amount: $" + bill.getAmount());
        System.out.println("Provider: " + bill.gasProvider);
        System.out.println("Connection Type: " + bill.connectionType);
        System.out.println("Consumption: " + bill.gasConsumption);
        bill.deductingFromAccount();
    }
}
