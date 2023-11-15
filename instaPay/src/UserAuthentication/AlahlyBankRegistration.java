package UserAuthentication;

import API.AlahlyBankAPI;
import API.BankAPI;
import UserData.AlahlyBank;
import UserData.Bank;

public class AlahlyBankRegistration extends BankRegistration{

    @Override
    public Bank createBankAccount() {
        Bank bank = new AlahlyBank();
        bank.setBankName("Alahly");
        return bank;
    }

    @Override
    public BankAPI createBankAPI() {
        return new AlahlyBankAPI("https://api-service.com/");
    }
}
