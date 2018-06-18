import java.util.Scanner;

/**
 * Created by Lathika.Herath on 6/12/2018.
 */
public class MyCalculator {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number :");
        int y = sc.nextInt();

        double z = x + y;

        System.out.print("Total : "+z);

    }


}
