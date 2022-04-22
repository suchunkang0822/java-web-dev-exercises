package stdios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studio3 {
    public static void count(String str){
        char[] arrayChar = str.toCharArray();
        HashMap<String,Integer> log = new HashMap<>();
        for (char letter: arrayChar) {
            if(!log.containsKey(letter+"")){
                log.put(letter+"",1);
            }else{
                log.put(letter+"",log.get(letter+"")+1);
            }
        }

        for(Map.Entry<String,Integer> letter: log.entrySet()){
            System.out.println(letter.getKey()+": "+letter.getValue());
        }

    }

    public static void count(){

    }
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms " +
                "over to one side, you can put the quadratics into a form that " +
                "can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        count(text);
    }
}
