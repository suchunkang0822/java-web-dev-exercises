package exercises_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_exercise {
    public static int sumEven(ArrayList<Integer> arr){
        int sum = 0;
        for (int num:arr) {
            if(num%2==0){
                sum+= num;
            }
        }
        return sum;
    }

    public static void printIfFive(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Which length of string would you like to search?: ");
        int search = input.nextInt();

        for (String str:arr) {
            if(str.length() == search){
                System.out.println(str);
            }
        }
    }
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=0; i<10;i++){
//            arr.add(i);
//        }
//        System.out.println(sumEven(arr));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("one");
        arr2.add("two");
        arr2.add("fffff");
        arr2.add("ccc");
        arr2.add("ddddd");
//        printIfFive(arr2);

        String text = " I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] temp = text.split(" ");

        ArrayList<String> arr_str = new ArrayList<>(Arrays.asList(temp));
        printIfFive(arr_str);


    }
}
