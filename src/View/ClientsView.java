package src.View;

import src.until.GetValue;


public class ClientsView {
    public static int choice =-1;

    public static void main(String[] args) {
        do {
            switch (welcomeClient()) {
                case 1:
//                    menuView();
                    break;
                case 2:
//                    orderDetail();
                    break;
            }
        }while (choice !=0);
    }

//    public static void clientView() {
//        do {
//            switch (welcomeClient()) {
//                case 1:
//                    System.out.println("-----------------------------------------------------------------------------------------------");
//                    System.out.println("                                            Menu                                               ");
//                    printFood();
//                    break;
//            }
//        }while (choice !=0);
//    }
    private static int welcomeClient() {
        System.out.println("               ===================================");
        System.out.println("               |            Staff Page           |");
        System.out.println("               ===================================");
        System.out.println("               | Options:                        |");
        System.out.println("               |        1. Menu                  |");
        System.out.println("               |        2. Order                 |");
        System.out.println("               |        3. Updating              |");
        System.out.println("               |        0. Exit to account       |");
        System.out.println("               ===================================");
        choice = Integer.parseInt(GetValue.getString("Enter your choice:"));
        return choice;
    }
}
