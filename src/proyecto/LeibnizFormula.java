package proyecto;

public class LeibnizFormula {

    public static void main(String[] args){

        double pi = 0;
        for (int i = 1; i <1000000000; i += 4) {
            pi += 8.0 / (i * (i + 2l));
        }
        System.out.println(pi);

    }


}
