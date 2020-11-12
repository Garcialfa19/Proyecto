package proyecto;

public class Compugrams {

    public static void main(String[] args) {

        int n = 5;

        // ---->
        for (int i = 0; i < n; i++) {
            System.out.print("-");
            for (int j = 0; j < 1; j++) {
                if (i == (n-1))
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

            for (int j = 0; j < n; j++) {
                System.out.print("-");
                if (j == (n-1))
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
        for (int s = 0; s < n; s++) {
            System.out.print("*");
        }
        System.out.println();
        // middle of shape
        for (int i = 0; i < (n-2); i++) {
            System.out.print("*");
            for (int j = 0; j < (n-2); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // bottom line
        for (int s = 0; s < n; s++) {
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

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n || col == row) {
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
