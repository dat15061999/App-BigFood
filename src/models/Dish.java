package src.models;

import static src.models.Food.headerAdded;

public class Dish {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private double totalprice;
    private static int idcurrent=0;

    public Dish(String name, String descipton, double price, int quantity, double totalprice) {
        this.id = ++idcurrent;
        this.name = name;
        this.description = descipton;
        this.price = price;
        this.quantity = quantity;
        this.totalprice = totalprice;
    }

    public Dish() {};

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

    public String getDescipton() {
        return description;
    }

    public void setDescipton(String descipton) {
        this.description = descipton;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        String divider = "----------------------------------------------------------------------------------------------------------";
        String info = String.format("| %-3s | %-20s | %-30s |  $%-9.2f  | %-8d |   $%-9.2f   |", id, name, description,price, quantity, totalprice);
        if (!headerAdded) {
            String header = String.format("| %-3s | %-20s | %-30s |  %-11s  | %-8s |   %-10s  |\n%s",
                    "ID", "Name", "Description", "Price", "Quantity", "Total Price", divider);
            headerAdded = true;
            return String.format("%s\n%s\n%s", divider, header, info);
        }
        return String.format("%s\n%s", divider, info);
    }
}
