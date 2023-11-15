package API;

import BillManagment.Electricity;

public class ElectricityBillAPI extends BillAPI{
    @Override
    public String callAPI() {
        // It will be replaced with actual data when perform Electricity API using the URL
        // It might include making HTTP requests, parsing responses, etc.
        return "API Response for " + url;
    }
    @Override
    public  Electricity getBill() {

        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform Electricity API
        double amount = 100.0;
        String companyName = "Misr";
        String electricityProvider = "PowerCo";
        String voltageType = "220V";
        String electricityConsumption = "150 kWh";

        return new Electricity(amount, companyName, electricityProvider, voltageType, electricityConsumption);
    }
}
