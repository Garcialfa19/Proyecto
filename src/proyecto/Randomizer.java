package proyecto;

import java.util.*;

public class Randomizer {

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        mylist.add(input.nextInt());
        System.out.println("Enter second number:");
        mylist.add(input.nextInt());
        System.out.println("Enter third number:");
        mylist.add(input.nextInt());
        System.out.println("Enter fourth number:");
        mylist.add(input.nextInt());
        System.out.println("Enter fifth number:");
        mylist.add(input.nextInt());
            //prints the original list, shuffles it and then prints it again
        System.out.println("The original lists is: \n" + mylist);
        Collections.shuffle(mylist);
        System.out.println("The shuffled lists is: \n" + mylist);
    }
}
