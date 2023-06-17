package src.View;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    static int choice = 0;

    public static void main(String[] args) {
        do {
            welcome();
            switch (choice) {
                case 1:
                    boolean check = false;
                    login(check);
                    if (check) System.out.println("Success Login Admin");
                    break;

            }
        } while (choice != 0);
    }

    public static int welcome() {
        System.out.println("Welcome App BigFood - FoodStore Design ");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Client");
        System.out.println("0. Exit app");
        System.out.println("Enter your choice!");
        choice = new Scanner(System.in).nextInt();
        return choice;
    }

    ;

    public static boolean login(boolean check) {
        System.out.println("Enter your username");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Enter your password");
        String password = new Scanner(System.in).nextLine();
        if ((username == "admin" && password == "123456")) {
            return check = true;
        }
        return check = false;
    }  ;
}