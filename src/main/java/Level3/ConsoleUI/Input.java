package Level3.ConsoleUI;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.println(message);
        return sc.nextLine().trim();
    }
}
