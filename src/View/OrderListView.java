package src.View;

import src.models.OrderDetail;
import src.until.GetValue;


public class OrderListView {
    private static OrderDetail newOrderList = new OrderDetail();
    static int choice = -1;

    public static void main(String[] args) {
        do {
            switch (welcomeOrder()) {
                case 1:
                    printOrder();
                    break;
                case 2:
//                  paymentOrder();
                    break;
            }
        } while (choice != 0);
    }
    private static int welcomeOrder() {
        System.out.println("               ===================================");
        System.out.println("               |              Order              |");
        System.out.println("               ===================================");
        System.out.println("               | Options:                        |");
        System.out.println("               |        1. Print Order           |");
        System.out.println("               |        2. Payment               |");
        System.out.println("               |        0. Exit to menu          |");
        System.out.println("               ===================================");
        choice = Integer.parseInt(GetValue.getString("Enter your choice:"));
        return choice;
    }
    public static void printOrder(){

    }
}
