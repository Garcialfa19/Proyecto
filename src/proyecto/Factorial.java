package proyecto;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value;
        double factorial = 1;
        System.out.println("Please enter the number");
        value = input.nextInt();
        while (value > 1) {
            factorial *= value;
            value--;
        }
        System.out.println(factorial);
    }
}
