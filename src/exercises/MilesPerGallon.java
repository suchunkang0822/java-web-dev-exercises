package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas did your vehicle consume?");
        int gallons = input.nextInt();
        System.out.println("You travelled "+miles/gallons+" miles-per-gallon");
    }
}
