package TransactionManagment;

import UserData.User;

public class TransactionToInstaAccount extends Transaction {
    public boolean tranfer(String instaAccount, User users[]) {
        User receiverUser = search(instaAccount, users);
        if (receiverUser == null) {
            throw new Error("receiver not in users");
        }
        senderUser.getAccount().withdraw();
        receiverUser.getAccount().deposit();
        return true;
    }
    public User search(String instaAccount, User users[]){
        for (User user: users) {
            if(user.getInstapayAccount() == instaAccount){
                return user;
            }
        }
        return null;
    }
}
