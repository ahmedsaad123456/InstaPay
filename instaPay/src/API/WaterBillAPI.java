package API;

import BillManagment.Water;
public class WaterBillAPI extends BillAPI{
    @Override
    public String callAPI() {
        // It will be replaced with actual data when perform Water API using the URL
        // It might include making HTTP requests, parsing responses, etc.
        return "API Response for " + url;
    }
    @Override
    public Water getBill() {
        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform Water API
        double amount = 30.0;
        String companyName = "Misr";
        String waterProvider = "AquaCorp";
        String meterSize = "5 inches";
        String waterConsumption = "50 gallons";

        return new Water(amount, companyName, waterProvider, meterSize, waterConsumption);
    }
}
