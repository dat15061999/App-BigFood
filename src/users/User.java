package src.users;

import java.util.Date;

public class User {
    protected int id;
    protected String name;
    protected String userName;
    protected String passWord;
    protected int phone;
    protected int cccd;
    protected String address;
    protected int bod;

    public User(int id, String name, String userName, String passWord, int phone, int cccd, String address, int bod) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
        this.phone = phone;
        this.cccd = cccd;
        this.address = address;
        this.bod = bod;
    }
}
