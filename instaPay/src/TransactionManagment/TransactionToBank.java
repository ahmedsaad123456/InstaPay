package TransactionManagment;

import UserData.BankUser;
import UserData.User;

public class TransactionToBank extends Transaction {

    public boolean tranfer(String bankNumber, User users[]) {
        User receiverUser = search(bankNumber, users);
        if (receiverUser == null) {
            throw new Error("receiver not in users");
        }
        senderUser.getAccount().withdraw();
        receiverUser.getAccount().deposit();
        return true;
    }

    public User search(String bankNumber, User users[]) {
        for (User user : users) {
            //TO DO edit the design to get bank account number
            if (user.getAccount().getBankAccountNumber() == bankNumber) {
                return user;
            }
        }
        return null;
    }
}
