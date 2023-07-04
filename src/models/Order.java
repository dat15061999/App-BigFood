package src.models;


public class Order {
    private Clients client;
    private Employees staff;

    public Order() {}

    public Order( Clients client, Employees staff) {
        this.client = client;
        this.staff = staff;
    }
    public Clients getClient() {

        return client;
    }

    public void setClient(Clients client) {

        this.client = client;
    }

    public Employees getStaff() {

        return staff;
    }

    public void setStaff(Employees staff) {

        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", client='" + client + '\'' +
                ", staff='" + staff + '\'' +
                '}';
    }
}
