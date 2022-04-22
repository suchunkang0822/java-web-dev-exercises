package exercises_2;

import java.util.Arrays;

public class Array_exercise {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 3, 5, 8};
//        for (int x:arr) {
////            System.out.println(x);
//            if(x%2 == 1){
//                System.out.println(x);
//            }
//        }

        String text = " I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] arr_str1 = text.split(" ");
        System.out.println(Arrays.toString(arr_str1));

        String[] arr_str2 = text.split("\\.");
        System.out.println(Arrays.toString(arr_str2));

        String[] arr_str3 = text.split("not");
        System.out.println(Arrays.toString(arr_str3));


    }
}
