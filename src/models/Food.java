package src.models;


public class Food {
    static boolean headerAdded = false;
    public static int idCurrent = 0;
    private int id;
    private String name;
    private String description;
    private String status;
    private double price;
    private int quantity;

    public Food(String name, String description, int quantity, String status, double price) {
        this.id = ++idCurrent;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.price = price;
    }

    public Food(String name, String description, int quantity, double price) {
        this.id = ++idCurrent;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public Food() {
    }

    ;

    public String getStatus() {
        status = "";
        if (getQuantity() >= 10) {
            status = "Con hang";
        } else if (getQuantity() > 0) {
            status = "Sap het hang";
        } else if (getQuantity() == 0) {
            status = "Het hang";
        }
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        String divider = "----------------------------------------------------------------------------------------------------------------------------";
        String info = String.format("| %-3s | %-20s | %-30s | %-20s | %-20s |   $%-6.2f  |", id, name, description, Integer.toString(quantity), getStatus(), price);
        if (!headerAdded) {
            String header = String.format("| %-3s | %-20s | %-30s | %-20s | %-20s |    %-7s   |\n%s",
                    "ID", "Name", "Description", "Quantity", "Status", "Price", divider);
            headerAdded = true;
            return String.format("%s\n%s\n%s", divider, header, info);
        }
        return String.format("%s\n%s", divider, info);
    }
}

