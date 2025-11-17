package Level2;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String mensaje) {
        return sc.nextByte();
    }

    public static int readInt(String mensaje) {
        return sc.nextInt();
    }

    public static float readFloat(String mensaje) {
        return sc.nextFloat();
    }

    public static double readDouble(String mensaje) {
        return sc.nextDouble();
    }
}
