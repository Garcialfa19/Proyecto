package proyecto;

import java.util.Scanner;

public class Inverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5, num6, num7;
        double avg;

        System.out.println("Please enter the first number");
        num1 = input.nextInt();
        System.out.println("Please enter the second number");
        num2 = input.nextInt();
        System.out.println("Please enter the third number");
        num3 = input.nextInt();
        System.out.println("Please enter the fourth number");
        num4 = input.nextInt();
        System.out.println("Please enter the fifth number");
        num5 = input.nextInt();
        System.out.println("Please enter the sixth number");
        num6 = input.nextInt();
        System.out.println("Please enter the last number");
        num7 = input.nextInt();

        System.out.println("The list entered is: " + num1 + num2 + num3 + num4 + num5 + num6 + num7);
        System.out.println("The inverse of the list entered is: " + num7 + num6 + num5 + num4 + num3 + num2 + num1);

    }
}
