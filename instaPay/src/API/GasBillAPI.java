package API;

import BillManagment.Gas;

public class GasBillAPI extends BillAPI{
    @Override
    public String callAPI() {
        // It will be replaced with actual data when perform Gas API using the URL
        // It might include making HTTP requests, parsing responses, etc.
        return "API Response for " + url;
    }
    @Override
    public  Gas getBill() {
        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform Gas API
        double amount = 50.0;
        String gasProvider = "GasCorp";
        String connectionType = "Natural Gas";
        String gasConsumption = "30 m3";

        return new Gas(amount, gasProvider, connectionType, gasConsumption);
    }
}
