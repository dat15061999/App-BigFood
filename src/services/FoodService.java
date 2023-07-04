package src.services;

import src.until.FoodInterface;
import src.models.Food;
import src.until.GetValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class FoodService implements FoodInterface<Food> {
    public static List<Food> foods;


    public FoodService() {
    }

    static {
        foods = new ArrayList<>();
        foods.add(new Food( "Banh mi", "Lam tu bot my",2,"Con hang", 50000));
        foods.add(new Food( "Pho ga", "Lam tu bot gao",10,"Con hang", 25000));
        foods.add(new Food( "Pho bo", "Lam tu bot gao",10,"Con hang", 25000));
        foods.add(new Food( "Pho gio", "Lam tu bot gao",10,"Con hang", 25000));
        foods.add(new Food( "Bun bo", "Lam tu bot gao",10,"Con hang", 20000));
        foods.add(new Food( "Bun ga", "Lam tu bot gao",10,"Con hang", 20000));
        foods.add(new Food( "Bun gio", "Lam tu bot gao",10,"Con hang", 20000));
    }

    @Override
    public void create(Food food) {
        food.setId(food.getId());
        foods.add(food);
    }



    @Override
    public List<Food> findAll() {
        return foods;
    }

    @Override
    public void delete() {
        int idDelete = GetValue.getInt("Nhap id muon xoa");
        Iterator<Food> iterator = foods.iterator();
        while (iterator.hasNext()) {
            Food food = iterator.next();
            if (food.getId() == idDelete) {
                iterator.remove();
                System.out.println("Successfully removed from the food list ad id is " + idDelete);
                return;
            }
        }
        System.err.println("Can't find the id of the food you want to delete");
    }

    @Override
    public void edit() {
        int idEdit = GetValue.getInt("Nhap id muon edit");
        for (Food food : foods) {
            if (idEdit == food.getId()) {
                food.setName(GetValue.getString("Nhap ten moi"));
                food.setDescription(GetValue.getString("Nhap mieu ta"));
                food.setQuantity(GetValue.getInt("Nhap so luong"));
                food.setPrice(GetValue.getPrice("Nhap gia moi"));
                return;
            }
        }
        System.err.println("Can't find the id of the food you want to edit.");
    }

    @Override
    public void find() {
        System.out.println("1. Find food with id or price");
        System.out.println("2. Find food with name");
        System.out.println("0. Exit to find.");
        switch (GetValue.getInt("Enter your choice :")) {
            case 1:
                int findIdPrice = GetValue.getInt("Nhap id hoac gia cua san pham can tim");
                int count = 0;

                for (Food food : foods) {
                    if (findIdPrice == food.getId() || findIdPrice == (int) food.getPrice()) {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("| %-3s | %-20s | %-30s | %-20d | %-20s | $%-6.2f |\n",
                                food.getId(), food.getName(), food.getDescription(),food.getQuantity(),food.getStatus(), food.getPrice());
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        count++;
                    }
                }
                if ( count == 0) System.err.println("Can't find the id or price of the food you want to find.");
                break;
            case 2:
                String findName = GetValue.getString("Nhap ten cua san pham can tim");
                for (Food food : foods) {
                    if (findName.equals(food.getName())) {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("| %-3s | %-20s | %-30s | %-20d | %-20s | $%-6.2f |\n",
                                food.getId(), food.getName(), food.getDescription(),food.getQuantity(),food.getStatus(), food.getPrice());
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        return;
                    }
                }
                System.err.println("Can't find the name of the food you want to find.");
                break;
        }

    }
}




