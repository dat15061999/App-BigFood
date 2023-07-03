package src.services;

import src.models.Dish;
import src.models.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OrderDetail  {
    private static int idcurrent = 5000;
    private static int id;
    private  Order order;

    private  List<MenuService> dishList;
    private static Date date ;

    public OrderDetail() {
        this.id = ++idcurrent;
        this.order = new Order();
        this.dishList = new ArrayList<>();
        this.date = new Date();
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        OrderDetail.id = id;
    }

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        OrderDetail.date = date;
    }

}

