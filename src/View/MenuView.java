package src.View;

import src.models.Dish;
import src.models.Food;
import src.services.MenuService;
import src.until.GetValue;

import java.util.List;

import static src.View.FoodView.printFood;
import static src.services.FoodService.foods;
import static src.until.GetValue.choose;
import static src.until.GetValue.getInt;

public class MenuView {
    static MenuService[] newMenuDish = new MenuService[10];
    static int choice = -1;
    public static MenuService listDish = new MenuService();
    private static int count;

    public static void main(String[] args) {
        do {
            switch (welcomeMenu()) {
                case 1:
                    printFood();
                    chooseDish();
                    break;
                case 2:
                    printOrderDetail();
                    break;
                case 3:
                    deleteFood();
                    break;
                case 4:
//                  editFood();
                    break;
                case 5:
//                  findFood();
                    break;

            }
        } while (choice != 0);
    }

    private static int welcomeMenu() {
        System.out.println("               ===================================");
        System.out.println("               |              Menu               |");
        System.out.println("               ===================================");
        System.out.println("               | Options:                        |");
        System.out.println("               |        1. Choose dishes         |");
        System.out.println("               |        2. Print OrderDetail     |");
        System.out.println("               |        3. Delete dishes         |");
        System.out.println("               |        4. Edit dishes           |");
        System.out.println("               |        5. Find dishes           |");
        System.out.println("               |        0. Exit to menu          |");
        System.out.println("               ===================================");
        choice = Integer.parseInt(GetValue.getString("Enter your choice:"));
        return choice;
    }

    private static void chooseDish() {
        int id = getInt("Nhap id mua hang");
        Dish newdish = new Dish();
        for (Food food : foods) {
            if (id == food.getId()) {
                newdish.setName(food.getName());
                newdish.setDescipton(food.getDescription());
                newdish.setPrice(food.getPrice());
                newdish.setQuantity(getInt("Nhap so luong muon mua"));
                newdish.setTotalprice((food.getPrice()) * choose);
                listDish.create(newdish);
                System.out.println("Them mon an thanh cong");
                return;
            }
        }
        System.err.println("Can't find id");
    }

    private static void printOrderDetail() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("|                                            Order Detail                                                |");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-20s | %-30s |  %-11s | %-8s |   %-10s  |\n",
                "ID", "Name", "Description", "Price", "Quantity", "Total Price");
        List<Dish> listOrderDetail = listDish.findAll();
        if (newMenuDish != null) {
            for (Dish dish : listOrderDetail) {
                System.out.println(dish);
            }
        }
    }

    private static void deleteFood() {
        listDish.delete(getInt("Nhap id muon xoa"));
    }


}


