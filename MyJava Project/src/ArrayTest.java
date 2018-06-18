/**
 * Created by Lathika.Herath on 6/12/2018.
 */
public class ArrayTest {

    public static void main(String args[]){

        int[] myArray;

        myArray = new int[6];

        myArray[0] = 12;
        myArray[1] = 47;
        myArray[2] = 56;
        myArray[3] = 89;
        myArray[4] = 43;
        myArray[5] = 67;

        System.out.println("My first value is : "+myArray[0]);

        for (int i= 0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
