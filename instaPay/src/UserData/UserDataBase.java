package UserData;

import BillManagment.Bill;

import java.util.ArrayList;

public class UserDataBase {
    private static ArrayList<User> users =  new ArrayList<>();


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
            if (user.getAccount().getMobileNumber().equals(mobileNumber)) {
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

    public void saveUser(User user)
    {
        users.add(user);
    }

    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByInstaAccount(String instaAccount) {
        for (User user : users) {
            if (user.getInstapayAcoount().equals(instaAccount)) {
                return user;
            }
        }
        return null;
    }

    public boolean checkInstapayAccount(String instapayAccount) {
        for (User user : users) {
            if (user.getInstapayAcoount().equals(instapayAccount)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkPassword(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }



}
