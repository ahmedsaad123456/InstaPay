package BillManagment;

public class WaterBillAPI {
    static String url;
    public WaterBillAPI(String u) {
        url = u;
    }

    private static String callAPI() {
        // It will be replaced with actual data when perform Water API using the URL
        // It might include making HTTP requests, parsing responses, etc.
        return "API Response for " + url;
    }
    public static Water getWaterBill() {
        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform Water API
        double amount = 30.0;
        String waterProvider = "AquaCorp";
        String meterSize = "5 inches";
        String waterConsumption = "50 gallons";

        return new Water(amount, waterProvider, meterSize, waterConsumption);
    }
}
