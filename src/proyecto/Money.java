package proyecto;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        int value;
        int c1000 = 0;
        int c500 = 0;
        int c100 = 0;
        int c10 = 0;
        int c5 = 0;
        int c1 = 0;

        System.out.println("Please enter the amount of money you wish to calculate: ");
        value = input.nextInt();

        while (value >= 1000) {
            value -= 1000;
            c1000++;
        }
        while (value >= 500) {
            value -= 500;
            c500++;
        }
        while (value >= 100) {
            value -= 100;
            c100++;
        }
        while (value >= 10) {
            value -= 10;
            c10++;
        }
        while (value >= 5) {
            value -= 5;
            c5++;
        }
        while (value >= 1) {
            value -= 1;
            c1++;
        }

        System.out.println("You need " + c1000 + " €1000 bills");
        System.out.println(c500 + " €500 coin");
        System.out.println(c100 + " €100 coins");
        System.out.println(c10 + " €10 coins");
        System.out.println(c5 + " €5 coin");
        System.out.println(c1 + " €1 coins");
    }
}
