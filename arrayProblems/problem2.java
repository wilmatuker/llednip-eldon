import java.util.Scanner;

class problem2 {
    public static void main(String[] args) {
        Scanner impuuuut = new Scanner(System.in);

        System.out.println("How many numbers do you want to find the average of?");
        int size = impuuuut.nextInt();
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            numbers[i] = impuuuut.nextDouble();
        }

        //sum it all up
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        //divide by size for avg
        double avg = sum / size;

        System.out.println("Sum = " + String.valueOf(sum));
        System.out.println("Average = " + String.valueOf(avg));
    }
}
