package proyecto;

public class Money {
    public static void main(String[] args){

    // test one

    int value = 5656;
    int c1000 = 0;
    int c500 = 0;
    int c100 = 0;
    int c10 = 0;
    int c5 = 0;
    int c1= 0;



        while (value >= 1000) {
            value -= 1000;
            c1000 ++;
        }
        while (value >= 500) {
            value -= 500;
            c500 ++;
        }
        while (value >= 100) {
            value -= 100;
            c100 ++;
        }
        while (value >= 10) {
            value -= 10;
            c10 ++;
        }
        while (value >= 5) {
            value -= 5;
            c5 ++;
        }
        while (value >= 1) {
            value -= 1;
            c1 ++;
        }

        System.out.println(value);
        System.out.println(c1000);
        System.out.println(c500);
        System.out.println(c100);
        System.out.println(c10);
        System.out.println(c5);
        System.out.println(c1);
    }
}
