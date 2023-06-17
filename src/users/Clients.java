package src.users;

public class Clients extends User{
    private String role;

    public Clients(int id, String name, String userName, String passWord, int phone, int cccd, String address, int bod, String role) {
        super(id, name, userName, passWord, phone, cccd, address, bod);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Clients{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phone=" + phone +
                ", cccd=" + cccd +
                ", address='" + address + '\'' +
                ", bod=" + bod +
                ",role='" + role + '\'' +
                '}';
    }
}
