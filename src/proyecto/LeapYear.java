package proyecto;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        // user input
        System.out.println("Please enter the year you want to check");
        year = input.nextInt();

        // Calculation
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
            System.out.println(year + " is a Leap-Year");
        else
            System.out.println(year + " is not a Leap-Year");
    }
}
