import java.util.Scanner;

public class firstScanner {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.println("Enter the amount of revolutions around the sun you've existed for");
        System.out.println("\n(Just enter thine age)\n");
        System.out.println("Enter here: ");
        int age = skanner.nextInt();
        //division
        age /= 2
        //change age to char because ascii exists
        char ageChar = (char) (age + 32);
        System.out.println("The ascii character coresponding to half your age plus 32: " + (ageChar));
        System.out.println("(Some characters are control characters)");
    }
}
