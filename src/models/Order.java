package src.models;

import src.services.OrderDetail;

public class Order {
    private String client;
    private String staff;

    public Order() {}

    public Order( String client, String staff) {
        this.client = client;
        this.staff = staff;
    }
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
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
