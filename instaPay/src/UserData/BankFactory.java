package UserData;

public class BankFactory {
    public Bank createBank(String bankName){
        if(bankName.equals("Alahly")){
            return new AlahlyBank();
        } else if (bankName.equals("Misr")){
            return new MisrBank();
        }

        return null;
    }
}
