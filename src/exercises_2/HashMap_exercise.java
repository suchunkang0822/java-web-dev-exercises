package exercises_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_exercise {

    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter numerical value");
//        int option;
//        option = input.nextInt(); // Read numerical value from input
//        input.nextLine();
//        System.out.println("Enter 1st string");
//        String string1 = input.nextLine(); // Read 1st string (this is skipped)
//        System.out.println("Enter 2nd string");
//        String string2 = input.nextLine(); // Read 2nd string (this appears right after reading numerical value)
        HashMap<String,Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
//        Double newID;

        System.out.println("Enter your students (or ENTER to finish):");

        do{
            System.out.println("Student: ");
            newStudent = input.nextLine();
//            newID = input.nextDouble();


            if(!newStudent.equals("")){
                System.out.println("ID: ");
                Integer newId = input.nextInt();
                students.put(newStudent,newId);
//                System.out.println("Student: ");
//                String newStudent = input.nextLine();
//                students.put(newID,newStudent);

                input.nextLine();
            }



        } while(!newStudent.equals(""));

//        Print class
        System.out.println("\nClass roster:");

        for(Map.Entry<String,Integer> id:students.entrySet()){
            System.out.println(id.getKey()+": "+id.getValue());
        }
    }
}
