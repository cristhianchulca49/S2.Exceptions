package Level2;

import Level2.Exceptions.CustomStringException;

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
        while (true) {
            try {
                System.out.println(message);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Sorry, Format error! check if you write the number with comma");
            } finally {
                sc.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                char letter = sc.next().charAt(0);
                if (Character.isLowerCase(letter)) {
                    return letter;
                } else {
                    throw new CustomStringException("Only lowercase letters are allowed, no numbers or uppercase letters");
                }
            } catch (CustomStringException e) {
                System.out.println(e.getMessage());
            } finally {
                sc.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.println(message);
                String name = sc.nextLine();
                if (name.equals(name.toLowerCase())) {
                    return name;
                } else {
                    throw new CustomStringException("Only lowercase letters are allowed, no numbers or uppercase letters");
                }
            } catch (CustomStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean readBoolean(String message) {
        while (true) {
            try {
                System.out.println(message);
                String letter = sc.nextLine();
                if (letter.length() > 1) {
                    throw new CustomStringException("Input must be a single letter: Y or N");
                }
                return switch (letter.toLowerCase()) {
                    case "n" -> false;
                    case "y" -> true;
                    default -> throw new CustomStringException("You just have to write Y or N");
                };
            } catch (CustomStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
