package src.User;

public class Manager extends User{
    private String role;

    public Manager(int id, String name, int phone, String userName, String passWord, int cccd, String address, int bod, String role) {
        super(id, name, phone, userName, passWord, cccd, address, bod);
        this.role = role;
    }

    public Manager(int id, String name, int phone, String userName, String passWord, int cccd, String address, int bod) {
        super(id, name, phone, userName, passWord, cccd, address, bod);
    }
}
