package src.View;

import src.until.GetValue;

import static src.View.FoodView.printFood;

public class MenuView {
    static int choice = -1;

    public static void menuView() {
        do {
            switch (welcomeMenu()) {
                case 1:
                    printFood();
                    break;
                case 2:
//                    chooseDishes();
                    break;
                case 3:
//                    deleteDishes();
                    break;
                case 4:
//                    findDishes();
                    break;
            }
        }while(choice!=0);
    }

    private static int welcomeMenu() {
        System.out.println("               ===================================");
        System.out.println("               |              Menu               |");
        System.out.println("               ===================================");
        System.out.println("               | Options:                        |");
        System.out.println("               |        1. Print Menu            |");
        System.out.println("               |        2. Choose dishes         |");
        System.out.println("               |        3. Delete dishes         |");        ;
        System.out.println("               |        4. Edit dishes           |");
        System.out.println("               |        5. Find dishes           |");
        System.out.println("               |        0. Exit to menu          |");
        System.out.println("               ===================================");
        choice = Integer.parseInt(GetValue.getString("Enter your choice:"));
        return choice;
    }
}