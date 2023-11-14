package BillManagment;

import UserData.User;

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
        Gas bill = BillAPI.getGasBill();
        System.out.println("Gas bill created for user: " + getUser().getUsername());
        System.out.println("Amount: $" + bill.getAmount());
        System.out.println("Provider: " + bill.gasProvider);
        System.out.println("Connection Type: " + bill.connectionType);
        System.out.println("Consumption: " + bill.gasConsumption);
        bill.deductingFromAccount();
    }
}
