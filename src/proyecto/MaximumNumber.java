package proyecto;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the series of numbers that you want to compare followed by the word Done");
        double max = in.nextDouble();
        while (in.hasNextDouble()) {
            double input = in.nextDouble();
            if (input > max) {
                max = input;
            }
        }
        System.out.println("the largest number is: " + max);
    }
}
