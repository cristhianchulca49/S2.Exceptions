package Level2;

public class Main {
    static void main(String[] args) {
        byte age = Input.readByte("Enter your age: ");
        System.out.println("Your age is: " + age);

        int phoneNumber = Input.readInt("What's your phone number?");
        System.out.println("Your phone number is: " + phoneNumber);

        float average = Input.readFloat("Enter your school average");
        System.out.println("Your school average is: " + average);

        double  pi = Input.readDouble("What's PI's value?");
        System.out.println("The PI value is: " + pi);

        char letter = Input.readChar("Choose a Letter");
        System.out.println("The letter is: " + letter);

        String name = Input.readString("Write your name");
        System.out.println("Your  name is: " + name);

        boolean y_n = Input.readBoolean("Choose Y or N");
        System.out.println("You chose " + y_n);
    }
}
