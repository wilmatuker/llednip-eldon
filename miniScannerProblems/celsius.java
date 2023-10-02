import java.util.Scanner;

class celsius {
    public static void main(String[] args) {
        Scanner skinair = new Scanner(System.in);
        System.out.println("You never learned Farenheit, so you use this program to make it make sense to your brain (makes sense)");
        System.out.println("What is the number before the degrees F you see?");
        double f = skinair.nextDouble();
        System.out.println("The Celsius value is: " + ((f - 32) / 1.8) + " degrees C");
    }
}