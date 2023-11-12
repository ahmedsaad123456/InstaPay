package TransactionManagment;

import UserData.User;

public class TransactionToWallet extends Transaction {
    public boolean tranfer(String mobileNumber, User users[]) {
        User receiverUser = search(mobileNumber, users);
        if (receiverUser == null) {
            throw new Error("receiver not in users");
        }
        senderUser.getAccount().withdraw();
        receiverUser.getAccount().deposit();
        return true;
    }

    public User search(String mobileNumber, User users[]) {
        for (User user : users) {
            if (user.getMobileNumber() == mobileNumber) {
                return user;
            }
        }
        return null;
    }
}
