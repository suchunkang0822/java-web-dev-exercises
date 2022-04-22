package exercises_2;

import java.util.*;

public class Practice {
    private String name ;
    private int numberOfCredits = 4;
    private double gpa = 4.0;
    public Practice(String name){
        this.name = name;
    }
    public String toString(){
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }
    public String getName(){
        return this.name;
    }
    public boolean equals(Object toBeCompared){
        if(toBeCompared == this){
            return true;
        }
        if(toBeCompared == null){
            return false;
        }
        if(toBeCompared.getClass() != getClass()){
            return false;
        }

        Practice example = (Practice) toBeCompared;
        return example.getName() == getName();

    }
    public static void main(String[] args) {
        ArrayList<String> e = new ArrayList<>();
        e.add("one");
        e.add("two");
        e.add("three");

        ArrayList<String> w = new ArrayList<>();
        w.add("one");
        w.add("two");
        w.add("three");

        int[] a = {1,2,3,4,5};
//        System.out.println(Arrays.toString(e).equals(Arrays.toString(w)));
        e.remove(0);
        System.out.println(e);

//        Practice example = new Practice("John");
//        Practice example2 = new Practice("John");
//        System.out.println(example.equals(example2));
//        System.out.println(example);

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//        System.out.println("Enter any numbers you would like to add. ");
//        Scanner input = new Scanner(System.in);
//
//        String userinput = "xx";
//        int nextnum = 0;
//        while (userinput.length() > 0) {
//            try {
//                userinput = input.nextLine();
//                nextnum = Integer.parseInt(userinput);
//                numbers.add(nextnum);
//                System.out.println("Taken");
//            } catch (NumberFormatException e) {
//                System.out.println("Inputs complete");
//            }
//        }
//
//        System.out.println(numbers);
//
//        input.close();

//        HashMap<Integer,String> map = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String newID;
//
//        System.out.println("Enter ID (or ENTER to finish):");
//
//        do{
//            System.out.println("ID: ");
//            newID = input.nextLine();
//
//
//            if(!newID.equals("")){
//                System.out.println("Student: ");
//                String newStudent = input.nextLine();
//                map.put(Integer.parseInt(newID),newStudent);
//
////                input.nextLine();
//            }
//
//
//        } while (!newID.equals(""));
//
//        System.out.println("\nClass roster:");
//
//        for(Map.Entry<Integer,String> id:map.entrySet()){
//            System.out.println(id.getKey()+": "+id.getValue());
//        }

//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("one",1);
//        map.put("two",2);
//        map.put("three",3);
//
//        System.out.println(map.keySet());
//        for (String key:map.keySet()){
//            System.out.println(key+": "+map.get(key));
//        }
//
//        System.out.println("**********");
//
//        map.put("four",4);
//        map.put("five",5);
//
//        for (String key:map.keySet()){
//            System.out.println(key);
//        }

    }
}
