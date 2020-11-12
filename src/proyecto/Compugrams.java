package proyecto;

public class Compugrams {
    public static void main(String[] args) {

        // ---->
        for (int i = 0; i < 4; i++) {
            System.out.print("-");
            for (int j = 0; j < 1; j++) {
                if (i == 3)
                    System.out.print(">");
            }
        }

        // Visual spacer
        System.out.println();
        System.out.println();

        //---->
        //---->
        //---->

        for (int p = 0; p < 3; p++) {

            for (int j = 0; j < 4; j++) {
                System.out.print("-");
                if (j == 3)
                    System.out.print(">");

            }
            System.out.println();
        }
        // Visual spacer
        System.out.println();
        System.out.println();

        //*****
        //*   *
        //*   *
        //*   *
        //*****

        // top line
        for (int s = 0; s < 5; s++) {
            System.out.print("*");
        }
        System.out.println();
        // middle of shape
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // bottom line
        for (int s = 0; s < 5; s++) {
            System.out.print("*");
        }

        // Visual spacer
        System.out.println();
        System.out.println();

        //*****
        //**  *
        //* * *
        //*  **
        //*****

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == 1 || row == 5 || col == 1 || col == 5 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Visual spacer
        System.out.println();
        System.out.println();

        //*****
        //*  **
        //* * *
        //**  *
        //*****

        int n =5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n || col == (n-row+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Visual spacer
        System.out.println();
        System.out.println();

        //*****
        //** **
        //* * *
        //** **
        //*****

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n || col == (n-row+1) || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
