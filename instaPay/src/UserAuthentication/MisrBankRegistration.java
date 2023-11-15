package UserAuthentication;

import API.BankAPI;
import API.MisrBankAPI;
import UserData.Bank;
import UserData.MisrBank;

public class MisrBankRegistration  extends BankRegistration{
    @Override
    public Bank createBankAccount() {
        Bank bank = new MisrBank();
        bank.setBankName("Misr");
        return bank;
    }

    @Override
    public BankAPI createBankAPI() {
        return new MisrBankAPI("https://api-service.com/");
    }
}
