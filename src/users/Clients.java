package src.users;

public class Clients extends User{
    private String role;

    public Clients(int id, String name, String userName, String passWord, int phone, int cccd, String address, int bod, String role) {
        super(id, name, userName, passWord, phone, cccd, address, bod);
        this.role = role;
    }
}
