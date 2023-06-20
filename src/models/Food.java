package src.models;



public class Food  {
    private static boolean headerAdded = false;
    static int idCurrent=0;
    private int id;
    private String name;
    private String description;
    private String status;
    private double price;

    public Food( String name, String description,String status , double price) {
        this.id = ++idCurrent;
        this.name = name;
        this.description = description;
        this.status =status;
        this.price = price;
    }
    public Food( String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Food () {};

    public String getStatus() {
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

    @Override
    public String toString() {
        String divider = "-----------------------------------------------------------------------------------------------------";
        String info = String.format("| %-3s | %-20s | %-30s | %-20s |   $%-6.2f  |", id, name, description,status, price);
        if (!headerAdded) {
            String header = String.format("| %-3s | %-20s | %-30s | %-20s |   %-7s   |\n%s",
                    "ID", "Name", "Description","Status", "Price", divider);
            headerAdded = true;
            return String.format("%s\n%s\n%s", divider, header, info);
        }
        return String.format("%s\n%s", divider, info);
    }
}

