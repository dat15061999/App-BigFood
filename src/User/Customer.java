package src.User;

public class Customer extends User {
    private String role;
    public Customer(int id, String name, int phone, String userName, String passWord, int cccd, String address, int bod) {
        super(id, name, phone, userName, passWord, cccd, address, bod);
    }

    public Customer(int id, String name, int phone, String userName, String passWord, int cccd, String address, int bod, String role) {
        super(id, name, phone, userName, passWord, cccd, address, bod);
        this.role = role;
    }
}
