package proyecto;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner uinput = new Scanner(System.in);
        double value;
        double factorial = 1;
        double input;
        System.out.println("Please enter the number");
        input = uinput.nextInt();
        value = input;
        while (value > 1) {
            factorial *= value;
            value--;
        }
        System.out.println("The factorial of " + input + " is: " + factorial);
    }
}
