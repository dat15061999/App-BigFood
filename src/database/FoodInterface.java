package src.database;

import src.models.Food;

import java.util.List;

public interface FoodInterface<T extends Food> {
    void update(T food);

    void create(T food);
    void  delete();
    void edit();
    void find();

    <T> List<Food> findAll();

}
