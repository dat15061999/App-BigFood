package src.until;

import java.util.Scanner;

public class GetValue {
    static Scanner input = new Scanner(System.in);

    public static int choose;


    public static String getString(String str) {
        System.out.println(str);
        return input.nextLine();
    }

    public static int getInt(String str) {
        try {
            choose = Integer.parseInt(GetValue.getString(str));
            return choose;
        } catch (NumberFormatException e) {
            System.out.println("Number invalid");
            return getInt(str);
        }
    }
    public static int getPrice(String str) {
        try {
            choose = Integer.parseInt(GetValue.getString(str));
            if (choose < 10000 || choose > 1000000) {
                throw new NumberFormatException("Price of Food up to 10.000 from 1.000.000$ ");
            }
            return choose;

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return getInt(str);
        }
    }

}
