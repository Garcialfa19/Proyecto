package proyecto;

import java.util.Scanner;

public class ShapeArea {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        // Variables for Square (Side)^2
        int side;
        // Variables for Rectangle (Base * Height)
        int base;
        int height;
        // Variables for Circle (pi*r^2)
        int radius;
        double pi = Math.PI;
        // Variables to chose type of Shape
        char shape;
        double result;

        System.out.println("Please enter the type of shape: ");
        shape = input.next().charAt(0);

        switch (shape) {
            // square
            case 's':
                System.out.println("Please enter the measurement of the side of the square:");
                side = input.nextInt();
                result = (side * side);
                break;
            // rectangle
            case 'r':
                System.out.println("Please enter the measurement of the base of the rectangle:");
                base = input.nextInt();
                System.out.println("Please enter the measurement of the height of the rectangle:");
                height = input.nextInt();
                result = (base * height);
                break;
            // circle
            case 'c':
                System.out.println("Please enter the measurement of the radius of the circle:");
                radius = input.nextInt();
                result = (pi * (radius * radius));
                break;
            // if opCode invalid
            default:
                System.out.println("invalid shape: " + shape);
                result = 0.0d;
                break;
        }
        System.out.println("The area of the shape entered  is: " + result);
    }
}
