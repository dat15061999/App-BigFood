package src.models;

import src.services.MenuService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OrderDetail {
    private static int idCurrent = 5000;
    private int id;
    private Order order;

    private List<MenuService> dishList;
    private Date date;

    public OrderDetail() {
        this.id = ++idCurrent;
        this.order = new Order();
        this.dishList = new ArrayList<>();
        this.date = new Date();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<MenuService> getDishList() {
        return dishList;
    }

    public void setDishList(List<MenuService> dishList) {
        this.dishList = dishList;
    }

}


