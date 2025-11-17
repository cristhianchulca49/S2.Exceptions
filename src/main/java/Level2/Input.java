package Level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Sorry, Format error try again");
            } finally {
                sc.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        return sc.nextInt();
    }

    public static float readFloat(String message) {
        return sc.nextFloat();
    }

    public static double readDouble(String message) {
        return sc.nextDouble();
    }
}
