package proyecto;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {

        String name;
        int salary;
        int nDependants;
        double pSalary = 0;
        double pDependants = 0;
        double Tax;
        Scanner input = new Scanner(System.in);

        System.out.print("Hi, Welcome to David's tax calculator \nPlease enter your name: ");
        name = input.next();
        System.out.println(name + " please enter the amount of money you earn in a month: ");
        salary = input.nextInt();
        System.out.println("Please enter the number of dependants you have: ");
        nDependants = input.nextInt();

        // Calculates pDependants

        if (nDependants == 1)
            pDependants = 1.00d;
        else if (nDependants == 2)
            pDependants = 0.90d;
        else if (nDependants == 3)
            pDependants = 0.70d;
        else if (nDependants == 4)
            pDependants = 0.60d;
        else if (nDependants >= 4)
            pDependants = 0.40d;

        // Calculates pSalary

        if (salary < 200000)
            pSalary = 0;
        else if (salary >= 200001 & salary < 400000)
            pSalary = 0.10d;
        else if (salary >= 400001 & salary < 600000)
            pSalary = 0.15d;
        else if (salary >= 600001 & salary < 800000)
            pSalary = 0.20d;
        else if (salary >= 800001)
            pSalary = 0.30d;

        // Calculates and prints Tax
        Tax = (salary * pDependants) * pSalary;
        System.out.println("The amount of money you have to pay in taxes is: " + Tax);

    }
}
