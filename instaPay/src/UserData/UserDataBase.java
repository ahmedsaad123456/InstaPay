package UserData;

import BillManagment.Bill;

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

    //------------------------------------------------------------------------------------
    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean updateUser(User user) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                u.setInstapayAcoount(user.getInstapayAcoount());
                u.setMobileNumber(user.getMobileNumber());
                u.setPassword(user.getPassword());
                return true;
            }
        }
        return false;
    }

    public boolean deleteUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }

//------------------------------------------------------------------------------------
    public User loadInstapayUser(String instapayAccount) {
        for (User user : users) {
            if (user.getInstapayAcoount().equals(instapayAccount)) {
                return user;
            }
        }
        return null;
    }


    public User loadUser(String name){
        for (User user : users) {
            if (user.getUsername().equals(name)) {
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
