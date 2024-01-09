import java.util.Scanner;

class multiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello!  Please input the number you want a multiplication table of:\n    >> ");
        double number = input.nextDouble();
        long numint = (int) number;
        
        for (int i = 0; i <= 25; i++) {
            if (number % 1 == 0) {
                System.out.println("This is whole so");
                numint = Math.round(number);
                System.out.print(String.valueOf(numint) + " * " + String.valueOf(i) + " = " + String.valueOf(numint * i) + "\n");
            }
            else {
                System.out.print(String.valueOf(number) + " * " + String.valueOf(i) + " = " + String.valueOf(number * i) + "\n");
            }
        }
    }    
}
