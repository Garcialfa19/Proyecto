package proyecto;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        int base;
        int exponent;
        Scanner input = new Scanner(System.in);


        /*just wanted to see how Math.pow worked
        System.out.println(Math.pow(x, y));
        */


        // user inputs the base of the expression
        System.out.println("Please enter value of the base of the expression: ");
        base = input.nextInt();
        // user inputs the exponent of the expression
        System.out.println("Please enter value of the exponent of the expression: ");
        exponent = input.nextInt();

        // the result is calculated
        for (int y = exponent; y != 0; y--) {
            base *= base;
            y--;
        }

        System.out.println("The result is: " + base);
    }
}