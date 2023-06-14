package src.User;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBod() {
        return bod;
    }

    public void setBod(int bod) {
        this.bod = bod;
    }

}
