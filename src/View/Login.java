package src.View;

import src.until.GetValue;

import static src.View.AdminView.adminView;
//import static src.View.ClientsView.clientView;
import static src.View.StaffView.staffView;

public class Login {
    static int choice = -1;

    public static void main(String[] args) {
        do {
            switch (welcome()) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
            }
        } while (choice != 0);
    }

    public static int welcome() {
        System.out.println("               ============================================");
        System.out.println("               |  Welcome App BigFood - FoodStore Design  |");
        System.out.println("               ============================================");
        System.out.println("               | Options:                                 |");
        System.out.println("               |        1. Login                          |");
        System.out.println("               |        2. Register                       |");
        System.out.println("               |        0. Exit to app                    |");
        System.out.println("               ============================================");
        choice = Integer.parseInt(GetValue.getString("Enter your choice:"));
        return choice;
    }

    public static void login() {
        String userLogin = GetValue.getString("Username is :");
        String passLogin = GetValue.getString("Password is :");
        if (userLogin.equals("admin") && passLogin.equals("123456"))
            adminView();
        else if (userLogin.equals("staff") && passLogin.equals("123456"))
            staffView();
        else if (userLogin.equals("user") && passLogin.equals("123456"));
//            clientView();
    }

    public static void register() {
        System.out.println("Updating program!");
    }

}