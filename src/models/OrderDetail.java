package src.models;



import src.until.FoodInterface;
import src.until.GetValue;

import java.util.ArrayList;
import java.util.List;

import static src.services.FoodService.foods;

public class OrderDetail implements FoodInterface<Dish> {
    private static int idcurrent = 0;

    private static List<Dish> dishList = new ArrayList<>();
    private  static Dish newdish;
    static int chooseQuatity ;

    public static List<Dish> getDishList() {
        int choosedish = Integer.parseInt(GetValue.getString("Nhap id san pham"));
        for (Food food : foods ) {
            if (food.getId() == choosedish)
                newdish = new Dish(++idcurrent,food.getName(),food.getDescription(), (int) food.getPrice(),getValueQuatity(),(food.getPrice())*chooseQuatity) ;
            dishList.add(newdish);
            break;
        }
        return dishList;
    }
    public static int getValueQuatity() {
        chooseQuatity = Integer.parseInt(GetValue.getString("Nhap so luong muon mua"));
        return chooseQuatity;

    }

    public static void main(String[] args) {
        System.out.println(getDishList().toString());;
    }

    @Override
    public void create(Dish dish) {
        Dish newdish = new Dish();
        int choosedish = Integer.parseInt(GetValue.getString("Nhap id san pham"));
        for (Food food : foods ) {
            if (food.getId() == choosedish)
                newdish = new Dish(++idcurrent,food.getName(),food.getDescription(), (int) food.getPrice(),getValueQuatity(),(food.getPrice())*chooseQuatity) ;
            dishList.add(newdish);
            break;
        }

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
    public List findAll() {
        return null;
    }


//    public static void main(String[] args) {
//        Dish newdish = new Dish(1,"Chuoi","Mot nai chuoi",5000);
//        dishList.add(newdish);
//        System.out.println(dishList.toString());
//    }

}

