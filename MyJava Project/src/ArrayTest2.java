import java.util.Scanner;

/**
 * Created by Lathika.Herath on 6/12/2018.
 */
public class ArrayTest2 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] myResults;
        myResults = new int[5];

        for(int i =0; i< myResults.length ; i++){
            System.out.println("Enter result :");
            int result = sc.nextInt();
            myResults[i] = result;
        }

        for (int i =0; i< myResults.length; i ++){

            System.out.print(myResults[i]);
        }
    }
}
