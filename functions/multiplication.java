import java.util.Scanner;

class multiplication {
    public static void main(String[] args) {
        System.out.println("That number is " + String.valueOf(input()));
    }
    
    public static double input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to multiply\n   > ");
        double num1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the number you want to multiply by\n    > ");
        double num2 = input.nextDouble();
        input.nextLine();

        return num1 * num2;

    }
}