package proyecto;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value1;
        double value2;
        double result;
        char opCode = 'c';

        // user input
        System.out.print("Please enter the first number: ");
        value1 = input.nextDouble();
        System.out.print("Please enter the type of operation: ");
        opCode = input.next().charAt(0);
        System.out.print("Please enter the second number: ");
        value2 = input.nextDouble();

        // back end
        switch (opCode) {
            // addition
            case 'a':
                result = value1 + value2;
                break;
            // subtraction
            case 's':
                result = value1 - value2;
                break;
            // multiplication
            case 'm':
                result = value1 * value2;
                break;
            // divition
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            // if opCode invalid
            default:
                System.out.println("invalid opCode: " + opCode);
                result = 0.0d;
                break;

        }
        System.out.println(result);
    }
}
