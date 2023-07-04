package src.services;

import src.models.Dish;
import src.until.FoodInterface;

import java.util.ArrayList;
import java.util.List;

public  class MenuService implements FoodInterface<Dish> {
    private static final List<Dish> dishList = new ArrayList<>();
    private static int idDish = 0;
    @Override
    public void create(Dish dish) {
        dish.setId(++idDish);
        dishList.add(dish);
    }
    public void delete(int idDish) {
        dishList.removeIf(dish -> dish.getId() == idDish);
    }

    @Override
    public void delete() {
    }

    @Override
    public void edit() {

    }

    @Override
    public void find() {

    }


    @Override
    public List<Dish> findAll() {
        return dishList;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
