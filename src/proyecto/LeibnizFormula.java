package proyecto;

public class LeibnizFormula {

    public static void main(String[] args) {

        int count = 1000000000;
        double pi = 0;
        double denominator = 1;

        for (int x = 0; x < count; x++) {

            if (x % 2 == 0) {
                pi = pi + (1 / denominator);
            } else {
                pi = pi - (1 / denominator);
            }
            denominator = denominator + 2;
        }
        pi = pi * 4;
        System.out.println(pi);
    }
}
