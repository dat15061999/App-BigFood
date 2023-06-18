package src.models;



public class Food  {
    private static boolean headerAdded = false;
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
        String divider = "---------------------------------------------------------------";
        String info = String.format("| %-3s | %-20s | %-30s |   $%-6.2f  |", id, name, description, price);
        if (!headerAdded) {
            String header = String.format("| %-3s | %-20s | %-30s |   %-7s   |\n%s",
                    "ID", "Name", "Description", "Price", divider);
            headerAdded = true;
            return String.format("%s\n%s\n%s", divider, header, info);
        }
        return String.format("%s\n%s", divider, info);
    }
}

