import java.util.Scanner;

/**
 * Created by Lathika.Herath on 6/13/2018.
 */
class StudentReport extends Student{


    public static void main(String args[]){

        Student[] studentList = new Student[6];

        for (int i =0; i < studentList.length; i++) {
            studentList[i] = new Student();
        }

        Scanner sc = new Scanner(System.in);

        name = sc.next();

        for (int i =0; i < studentList.length; i++){
            System.out.println("Enter student name : "+name);

            for (int x =0;x<subjects.length; x++ ){
                  subject = subjects[x];
                  mark = sc.nextInt();
                  System.out.println(subject+" : "+mark);
            }

        }
    }
}
class Student{

        static int mark ;
        static String[] subjects = {"Sinhala", "English", "Maths", "Science", "Sport"};

        static String name;
        static String subject;


    }


