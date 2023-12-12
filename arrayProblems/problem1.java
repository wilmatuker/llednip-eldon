import java.util.Scanner;

class problem1 {
    public static void main(String args[]) {
        Scanner impuut = new Scanner(System.in);

        System.out.println("Enter the numbers you wanna add without breaking your brain or using up lots of paper:");
        int size = impuut.nextInt();
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            numbers[i] = impuut.nextDouble();
        }

        //add it all together
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of all those numbers are" + String.valueOf(sum));


    }
}
