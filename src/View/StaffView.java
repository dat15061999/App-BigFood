package src.View;

import src.until.GetValue;

public class StaffView {
    public static int choice =-1;

    public static void  staffView() {
        System.out.println("Updating program!");
    }
    private static int welcomeStaff() {
        System.out.println("               ===================================");
        System.out.println("               |            Staff Page           |");
        System.out.println("               ===================================");
        System.out.println("               | Options:                        |");
        System.out.println("               |        1. Food Management       |");
        System.out.println("               |        2. Order                 |");
        System.out.println("               |        3. Timekeeping           |");
        System.out.println("               |        4. Total Salary          |");
        System.out.println("               |        5. Updating              |");
        System.out.println("               |        0. Exit to program       |");
        System.out.println("               ===================================");
        choice = Integer.parseInt(GetValue.getString("Enter your choice:"));
        return choice;
    }
}
