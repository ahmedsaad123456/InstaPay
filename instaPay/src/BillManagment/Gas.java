package BillManagment;

import UserData.User;
import API.GasBillAPI;

public class Gas extends Bill {

    private String gasProvider;

    private String connectionType;

    private String gasConsumption;
    public Gas() {
        this.gasProvider = "";
        this.connectionType = "";
        this.gasConsumption = "";
    }
    public Gas(double amount, String companyName,String gasProvider, String connectionType, String gasConsumption) {
        super(amount, companyName);
        this.gasProvider = gasProvider;
        this.connectionType = connectionType;
        this.gasConsumption = gasConsumption;
    }


    @Override
    public void createBill(String numberOfReceipt) {
        GasBillAPI gasBillAPI = new GasBillAPI();
        gasBillAPI.setURL("https://api-service.com/");
        Gas bill = gasBillAPI.getBill();

        this.setAmount(bill.getAmount());

        System.out.println("Gas bill created for user: " + getUser().getUsername());
        System.out.println("Company: " + bill.getCompanyName());
        System.out.println("Amount: $" + bill.getAmount());
        System.out.println("Provider: " + bill.gasProvider);
        System.out.println("Connection Type: " + bill.connectionType);
        System.out.println("Consumption: " + bill.gasConsumption);
        deductingFromAccount();
    }
}
