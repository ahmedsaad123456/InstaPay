package BillManagment;

public class ElectricityBillAPI {
    static String url;
    public ElectricityBillAPI(String u) {
        url = u;
    }

    private static String callAPI() {
        // It will be replaced with actual data when perform Electricity API using the URL
        // It might include making HTTP requests, parsing responses, etc.
        return "API Response for " + url;
    }
    public static Electricity getElectricityBill() {

        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform Electricity API
        double amount = 100.0;
        String electricityProvider = "PowerCo";
        String voltageType = "220V";
        String electricityConsumption = "150 kWh";

        return new Electricity(amount, electricityProvider, voltageType, electricityConsumption);
    }
}
