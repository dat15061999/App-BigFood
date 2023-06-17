package src.until;

import java.util.Scanner;

public class GetValue {
    static Scanner input = new Scanner(System.in);

    public  static  String getString(String str) {
        System.out.println(str);
        return input.nextLine();
    };
}
