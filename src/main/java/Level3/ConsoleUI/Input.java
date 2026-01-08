package Level3.ConsoleUI;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                String aux = sc.nextLine().trim();
                return Integer.parseInt(aux);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, You must write only number, not letters, dot or comma");
            }
        }
    }

    public static String readString(String message) {
        System.out.println(message);
        return sc.nextLine().trim();
    }
}
