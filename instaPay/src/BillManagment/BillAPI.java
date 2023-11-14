package BillManagment;

public class BillAPI {
    static String url;
    public BillAPI(String u) {
        url = u;
    }

    private static String callAPI() {
        // It will be replaced with actual logic when perform  API
        // It might include making HTTP requests, parsing responses, etc.
        return "API Response for " + url;
    }
    public static Electricity getElectricityBill() {
        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform API
        double amount = 100.0;
        String electricityProvider = "PowerCo";
        String voltageType = "220V";
        String electricityConsumption = "150 kWh";

        return new Electricity(amount, electricityProvider, voltageType, electricityConsumption);
    }

    public static Gas getGasBill() {
        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform API
        double amount = 50.0;
        String gasProvider = "GasCorp";
        String connectionType = "Natural Gas";
        String gasConsumption = "30 m3";

        return new Gas(amount, gasProvider, connectionType, gasConsumption);
    }

    public static Water getWaterBill() {
        String apiResponse = callAPI();

        //dummy data this data will replace with actual data when perform API
        double amount = 30.0;
        String waterProvider = "AquaCorp";
        String meterSize = "5 inches";
        String waterConsumption = "50 gallons";

        return new Water(amount, waterProvider, meterSize, waterConsumption);
    }
}
