package src.until;

import src.models.Dish;
import src.models.Food;

import java.util.List;

public interface FoodInterface<T> {


    void create(T str);

    //    void create();
    void  delete();
    void edit();
    void find();

    <T> List<T> findAll();

}
