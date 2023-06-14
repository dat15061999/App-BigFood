package src.services;

import src.users.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> userlist = new ArrayList<>();

    public UserService (){};

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userlist=" + userlist +
                '}';
    }
}
