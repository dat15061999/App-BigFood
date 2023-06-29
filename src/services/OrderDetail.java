package src.services;

import src.models.Dish;
import src.until.FoodInterface;
import src.until.GetValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static src.View.MenuView.orderDetail;


public class OrderDetail implements FoodInterface<Dish> {
    private static int idcurrent = 0;

    private static List<Dish> dishList = new ArrayList<>();


    @Override
    public void create(Dish dish) {
        dish.setId(++idcurrent);
        dishList.add(dish);
    }

    @Override
    public void delete() {
//        int idDelete = GetValue.getInt("Nhap id muon xoa");
//        boolean removed = false;
//        for (Dish dish : orderDetail) {
//            if (dish.getId() == idDelete) {
//                orderDetail.remove(dish);
//                System.out.println("Successfully removed from the food list ad id is " + idDelete);
//                removed = true;
//                break;
//            }
//        }
//        if (!removed) {
//            System.err.println("Can't find the id of the food you want to delete");
//        }
    }



    @Override
    public void edit() {

    }

    @Override
    public void find() {

    }

    @Override
    public List findAll() {
        return dishList;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

