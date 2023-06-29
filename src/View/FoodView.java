package src.View;

import src.models.Food;
import src.services.FoodService;
import src.until.GetValue;

import java.util.List;


public class FoodView extends FoodService {
    static FoodService foodService = new FoodService();
    static int choice = -1;
    static int count = -1;

    public static void foodView() {
        do {
            switch (printMenu()) {
                case 1:
                    printFood();
                    break;
                case 2:
                    addFood();
                    break;
                case 3:
                    deleteFood();
                    break;
                case 4:
                    editFood();
                    break;
                case 5:
                    findFood();
                    break;
            }
        } while (choice != 0);

    }

    private static int printMenu() {
        System.out.println("               ==========================================");
        System.out.println("               |                Food Page               |");
        System.out.println("               ==========================================");
        System.out.println("               | Options:                               |");
        System.out.println("               |        1. Print food in Screen         |");
        System.out.println("               |        2. Add food to food list        |");
        System.out.println("               |        3. Delete food in list          |");
        System.out.println("               |        4. Edit food in list            |");
        System.out.println("               |        5. Find food in list            |");
        System.out.println("               |        0. Exit to program              |");
        System.out.println("               ==========================================");
        choice = Integer.parseInt(GetValue.getString("Enter your choice:"));
        return choice;
    }


    public static void printFood() {
        List<Food> foods = foodService.findAll();
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("|                                               Menu                                                |");
        for (Food food : foods) {
            System.out.println(food);
        }
    }

    private static void addFood() {
        foodService.create(new Food(GetValue.getString("Nhap ten"), GetValue.getString("Nhap chi tiet"), Integer.parseInt(GetValue.getString("Nhap gia"))));
        System.out.println();
        printFood();
    }

    private static void deleteFood() {
        do {
            foodService.delete();
            System.out.println();
            System.out.println("1. Do you want to continue deleting?");
            System.out.println("0. Exit to Delete Food");
            count = Integer.parseInt(GetValue.getString("Enter your choice"));
        } while (count != 0);
    }

    private static void editFood() {
        do {
            foodService.edit();
            System.out.println();
            System.out.println("1. Do you want to continue editing?");
            System.out.println("0. Exit to Edit Food");
            count = Integer.parseInt(GetValue.getString("Enter your choice"));
        } while (count != 0);
    }
    private static void findFood() {
        do {
            foodService.find();
            System.out.println();
            System.out.println("1. Do you want to continue find?");
            System.out.println("0. Exit to Find Food");
            count = Integer.parseInt(GetValue.getString("Enter your choice"));
        } while (count != 0);
    }

}
