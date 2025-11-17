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
        while (true) {
            try {
                System.out.println(message);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Sorry, You must write only number, not letters, dot or comma");
            } finally {
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Sorry, Format error! check if you write the number with comma");
            } finally {
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        return sc.nextDouble();
    }
}
