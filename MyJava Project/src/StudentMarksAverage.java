import java.util.Scanner;

/**
 * Created by Lathika.Herath on 6/12/2018.
 */
public class StudentMarksAverage {



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] myMarks = new int[5];

        double z;
        int x = 0;
        int y = 0;
        int marks = 0;
        int result = 0;



        System.out.println("Enter your marks : ");

        for (int i =0; i < myMarks.length; i++){
            marks = sc.nextInt();
            myMarks[i] = marks;
        }

        for (int i =0; i < myMarks.length; i++){
            result = myMarks[i];

             x = x + result;
        }

        z = (x/myMarks.length);

        System.out.println("Your average mark is : "+z);



    }
}
