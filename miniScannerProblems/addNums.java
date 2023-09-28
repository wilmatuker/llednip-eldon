import java.util.Scanner;

public class addNums {
    public static void main(String[] args) {
        Scanner skooner = new Scanner(System.in);
        System.out.println("You have a stick\nWhat is thine stick's length in feet (say only the number)?");
        double num1 = skooner.nextDouble();
        System.out.println("You have another stick\n what is it's length in feet (say only the number)?");
        double num2 = skooner.nextDouble();
        System.out.println("You glued them together, and the new stick's length is " + (num1 + num2) + " feet long.");
    }    
}