package UserData;

import java.util.ArrayList;

public class UserDataBase {
    private ArrayList<User> users;
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public boolean uniqueUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public boolean uniqueMobileNumber(String mobileNumber) {
        for (User user : users) {
            if (user.getMobileNumber().equals(mobileNumber)) {
                return false;
            }
        }
        return true;
    }

    public boolean uniqueInstapayAccount(String instapayAccount) {
        for (User user : users) {
            if (user.getInstapayAcoount().equals(instapayAccount)) {
                return false;
            }
        }
        return true;
    }

    public boolean saveUser(User user) {
        if (uniqueUsername(user.getUsername()) && uniqueMobileNumber(user.getMobileNumber()) && uniqueInstapayAccount(user.getInstapayAcoount())) {
            users.add(user);
            return true;
        }
        return false;
    }



}
