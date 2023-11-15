package BillManagment;

public class BillFactory {
    public Bill createBill(String bill){
        if(bill.equals("Electricity")){
            return new Electricity();
        }
        else if (bill.equals("Water")){
            return new Water();
        }
        else if(bill.equals("Gas")){
            return new Gas();
        }

        return null;
    }
}
