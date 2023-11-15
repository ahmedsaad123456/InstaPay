package API;

import BillManagment.Bill;
public abstract class BillAPI {
    String url;
    public BillAPI(String u) {
        url = u;
    }
    public BillAPI (){
        url = "";
    }
    public void setURL(String u){
        url = u;
    }

    public abstract String callAPI();
    public abstract Bill getBill();
}
