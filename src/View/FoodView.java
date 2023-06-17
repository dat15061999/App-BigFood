package src.View;

import src.models.Food;
import src.services.FoodService;
import src.until.GetValue;

import java.util.List;
import java.util.Scanner;

import static src.until.GetValue.getString;

public class FoodView extends FoodService {
    static Scanner scanner = new Scanner(System.in);
    static FoodService foodService = new FoodService();
    static int choice = -1;

    public static void main(String[] args) {
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
            }
        } while (choice != 0);

    }

    private static int printMenu() {
        System.out.println("Welcome in to Admin Page");
        System.out.println("1. Print food in Screen");
        System.out.println("2. Add food to food list");
        System.out.println("3. Delete food in food list");
        System.out.println("4. Edit food to food list");
        System.out.println("5. Find food in food list");
        System.out.println("0. Exit to program.");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        return choice;
    }

    private static void printFood() {
        List<Food> foods = foodService.findAll();
        for (Food food : foods) {
            System.out.println(food);
        }
    }

    private static void addFood() {
        System.out.println("Current ID: " + foodService.getIdCurrent());
        foodService.create(new Food(GetValue.getString("Nhap ten"), GetValue.getString("nhap chi tiet"), Integer.parseInt(GetValue.getString("nhap gia"))));
        printFood();
    }

    private static void deleteFood() {
        foodService.delete();
        printFood();
    }

    private static void editFood() {
        foodService.edit();
        printFood();
    }


}
