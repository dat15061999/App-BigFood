package src.models;



public class Food  {
    private int id;
    private String name;
    private String description;
    private double price;
    private double totalprice;

    public Food( String name, String description, double price, double totalprice) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.totalprice = totalprice;
    }

    public Food(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Food( String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Food{id=%d, name='%s', description='%s'" +
                ", price=%.2f}", id, name, description, price);
    }
}
