import java.util.Scanner;

class arrayAvg {
    public static void main(String[] args) {
        Scanner inpuut = new Scanner(System.in);

        System.out.println("How long do you want the array? ");
        int size = inpuut.nextInt();
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("What number would you like to put in?\n   >> ");
            numbers[i] = inpuut.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double avg = sum / size;
        long avgint = 0;
        if(avg % 1 == 0) {
            avgint = Math.round(avg);
            System.out.println("The average is " + String.valueOf(avgint));
        }
        else {
            System.out.println("The average is " + String.valueOf(avg));
        }
    }    
}
