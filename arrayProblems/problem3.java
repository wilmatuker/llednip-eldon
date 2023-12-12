import java.util.Scanner;

class problem3 {
    public static void main(String args[]) {
        Scanner impuuut = new Scanner(System.in);
        System.out.println("How many numbers do you want to find the max of?");
        int size = impuuut.nextInt();
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("What number shall thee add to the compendium of numerical values?");
            numbers[i] = impuuut.nextDouble();
        }

        //iterate and update var
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The biggest number is " + String.valueOf(max));
    }
}
