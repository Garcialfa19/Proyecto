package proyecto;

import java.util.Scanner;

public class School {

    public static void main(String[] args) {

        int nstudents = 100;
        Scanner input = new Scanner(System.in);
        String[] name = new String[nstudents];
        int[] grade = new int[nstudents];
        int tempi;
        // assign empty space to initial array
        for (int i = 0; i < name.length; i++) {
            name[i] = "";
        }
        // assign 0 to initial array
        for (int j = 0; j < grade.length; j++) {
            grade[j] = 0;
        }


        for (int i = 0; i < nstudents; i++) {
            char Selection;
            System.out.println("what do you want to do?");
            System.out.println("A = Add new grade");
            System.out.println("D = Delete a grade");
            System.out.println("S = Show all registered grades");
            Selection = input.next().charAt(0);

            switch (Selection) {
                // Add new grade
                case 'A':
                    System.out.println("please enter the Student's id number");
                    tempi = input.nextInt();

                    System.out.println("please enter the Student's name");
                    name[tempi] = input.next();
                    System.out.println("please enter the Grade");
                    grade[tempi] = input.nextInt();
                    break;
                // delete a grade
                case 'D':
                    System.out.println("please enter the Student's id number");
                    tempi = input.nextInt();
                    grade[tempi] = 0;
                    break;
                // Show grades
                case 'S':
                    int k;
                    for (k = 1; k <= nstudents; k++)
                        if (grade[k] != 0) {
                            System.out.println("Student " + k);
                            System.out.println(name[k]);
                            System.out.println(grade[k]);
                        }
                    break;
                default:
                    System.out.println("invalid Selection: " + Selection);
                    break;

            }

        }
    }
}
