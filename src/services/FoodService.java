package src.services;

import src.database.FoodInterface;
import src.models.Food;
import src.until.GetValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static src.until.GetValue.getString;


public class FoodService implements FoodInterface {
    private static List<Food> foods;
    private static int idCurrent;


    public FoodService() {
    }

    static {
        foods = new ArrayList<>();
        foods.add(new Food(++idCurrent, "Banh mi", "Lam tu bot my", 5000));
        foods.add(new Food(++idCurrent, "Pho ga", "Lam tu bot gao", 25000));
        foods.add(new Food(++idCurrent, "Pho bo", "Lam tu bot gao", 25000));
        foods.add(new Food(++idCurrent, "Pho gio", "Lam tu bot gao", 25000));
        foods.add(new Food(++idCurrent, "Bun bo", "Lam tu bot gao", 20000));
        foods.add(new Food(++idCurrent, "Bun ga", "Lam tu bot gao", 20000));
        foods.add(new Food(++idCurrent, "Bun gio", "Lam tu bot gao", 20000));
    }

    ;

    @Override
    public void create(Food food) {
        food.setId(++idCurrent);
        System.out.println("Adding food: " + food.toString());
        foods.add(food);
    }

    public static int getIdCurrent() {
        return idCurrent;
    }

    @Override
    public void update(Food food) {

    }

    @Override
    public List<Food> findAll() {
        return foods;
    }

    @Override
    public void delete() {
        int idDelete = Integer.parseInt((GetValue.getString("Nhap id muon xoa")));
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
        int idEdit = Integer.parseInt((GetValue.getString("Nhap id muon edit")));
        for (Food food: foods) {
            if(idEdit == food.getId()) {
                food.setName(GetValue.getString("Nhap ten moi"));
                food.setDescription(GetValue.getString("Nhap mieu ta"));
                food.setPrice(Integer.parseInt(GetValue.getString("Nhap gia moi")));
                return;
            }
        }
        System.err.println("Can't find the id of the food you want to delete");
    }
}




