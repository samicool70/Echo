import java.util.Scanner;
import javax.swing.JOptionPane;

public class Echo {

    public static void main(String[] args){

        //declarations
        Scanner keyboard = new Scanner(System.in);

        //prompts and read in values
        System.out.println("Enter a byte value (number between 1 and 299)");
        byte by = keyboard.nextByte();

        System.out.println("Enter a short value");
        short s = keyboard.nextShort();

        System.out.println("Enter a integer value");
        int I = keyboard.nextInt();

        System.out.println("Enter a long value");
        long L = keyboard.nextLong();

        System.out.println("Enter a float value");
        float F = keyboard.nextFloat();

        System.out.println("Enter a double value");
        double D = keyboard.nextDouble();

        System.out.println("Enter a character");
        char C = keyboard.next().charAt(0);

        System.out.println("Enter a boolean value");
        boolean B = keyboard.nextBoolean();

        JOptionPane.showMessageDialog(null, "You have earned $ " + by + "\n" + "Your short value is " + s + "\n" + "Your int value is " + I + "\n" + "Your long value is " + L +
        "\n" + "Your float value is " + F + "\n" + "Your double value is " + D + "\n" + "Your char value is " + C + "\n" + "Your boolean value is " + B + "\n");
        //to separate the values in the dialogue box into separate individual lines
    }
}
