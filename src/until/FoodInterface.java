package src.until;


import java.util.List;

public interface FoodInterface<T> {


    void create(T str);

    //    void create();
    void  delete();
    void edit();
    void find();

    List<T> findAll();

}
