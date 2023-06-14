package User;

public class User {
    protected int id;
    protected String name;
    protected int phone;
    protected String userName;
    protected String passWord;
    protected int cccd;

    protected String address;
    protected int bod;

    public User(int id, String name, int phone, String userName, String passWord, int cccd, String address, int bod) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.userName = userName;
        this.passWord = passWord;
        this.cccd = cccd;
        this.address = address;
        this.bod = bod;
    }
}
