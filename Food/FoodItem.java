package Food;

public class FoodItem {
    private int id;
    private String name;
    private String description;
    private double price;
    private double totalprice;

    public FoodItem(int id, String name, String description, double price, double totalprice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.totalprice = totalprice;
    }
}
