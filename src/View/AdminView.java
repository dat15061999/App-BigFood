package src.View;

import src.until.GetValue;

import static src.View.FoodView.foodView;

public class AdminView {
    static int choice = -1;

    public static void  adminView() {
      while (choice!=0){
          choice = welcomeAdmin();
            switch (choice){
                case 1:
                    foodView();
                    break;
                case 2:
//                   userView();
                    break;
                case 3:
//                   oderListView();
                    break;
                case 4:
//                   staffView();
                    break;
            }
        }
    }

    private static int welcomeAdmin() {
        System.out.println("               ===================================");
        System.out.println("               |            Admin Page           |");
        System.out.println("               ===================================");
        System.out.println("               | Options:                        |");
        System.out.println("               |        1. Food Management       |");
        System.out.println("               |        2. User management       |");
        System.out.println("               |        3. Manage order list     |");
        System.out.println("               |        4. Employees             |");
        System.out.println("               |        5. Updating              |");
        System.out.println("               |        0. Exit to program       |");
        System.out.println("               ===================================");
        return Integer.parseInt(GetValue.getString("Enter your choice:"));
    }
}
