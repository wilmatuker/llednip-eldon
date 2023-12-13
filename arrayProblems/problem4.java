import java.util.Scanner;

class problem4 {
    public static void main(String args[]) {
        Scanner impuuuuut = new Scanner(System.in);
        System.out.println("How many numbers do you want to find the min of?");
        int size = impuuuuut.nextInt();
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("What number shall thee add to the compendium of numerical values?");
            numbers[i] = impuuuuut.nextDouble();
        }

        //find minimum
        double min = numbers[0];
        for (int i = 0; i < size; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("The smallest number is " + String.valueOf(min));
    }
}
