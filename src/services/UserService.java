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

    public void addUserlist(User user) {
        userlist.add(user);
    }
    public void remoteUserList(int id) {
        for (User item: userlist ) {
            if(item.getId() == id) {
                userlist.remove(item);
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "{" + userlist +'}';
    }
}
