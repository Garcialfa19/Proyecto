package proyecto;

import java.util.Scanner;

public class Average2 {

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
        System.out.println("Please enter the seventh number");
        num7 = input.nextInt();

        avg = (num1 + num2 + num3 + num4 + num5 + num6 + num7) / 7;
        System.out.print("The numbers you entered are: ");
        System.out.print(num1 + ", ");
        System.out.print(num2 + ", ");
        System.out.print(num3 + ", ");
        System.out.print(num4 + ", ");
        System.out.print(num5 + ", ");
        System.out.print(num6 + ", ");
        System.out.println(num7 + ", ");
        System.out.println("The average of the numbers is: " + avg);
   }
}
