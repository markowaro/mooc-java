
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int temp = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double temp1 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean temp2 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + temp);
        System.out.println("You gave the double " + temp1);
        System.out.println("You gave the boolean " + temp2);

    }
}
