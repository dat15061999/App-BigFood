package src.models;

public class Dish {
    private int id;
    private String name;
    private String descipton;
    private int price;
    private int quatity;
    private double totalprice;

    public Dish(int id, String name, String descipton, int price, int quatity, double totalprice) {
        this.id = id;
        this.name = name;
        this.descipton = descipton;
        this.price = price;
        this.quatity = quatity;
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
        return descipton;
    }

    public void setDescipton(String descipton) {
        this.descipton = descipton;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descipton='" + descipton + '\'' +
                ", Quatity=" + quatity +
                ", price=" + price +
                ", Totalprice=" + totalprice +
                '}';
    }
}
