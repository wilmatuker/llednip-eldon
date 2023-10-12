import java.util.Scanner;

class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're trying to see whether x amount of things are even or odd");
        System.out.println("How many objects do you have?");
        double num = input.nextDouble();

        if (num % 2 == 0) {
            System.out.println("This number is even my friend");
        } else {
            System.out.println("This number is odd my friend");
        }
    }
}
