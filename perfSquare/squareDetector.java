import java.util.Scanner;

public class squareDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many rows do you want?\n   >> ");
        int r = input.nextInt();
        System.out.print("How many columns do you want?\n   >> ");
        int c = input.nextInt();

        double[][] numbers = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter a number\n    >> ");
                numbers[i][j] = input.nextDouble();
            }
        }

        String[][] answers = new String[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(Math.sqrt(numbers[i][j]) % 1 == 0){
                    answers[i][j] = "yes";
                }
                else{
                    answers[i][j] = "no";
                }
            }
        }

        System.out.println("Behold\nThe answer to if the number is a perfect square or not");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(String.valueOf(answers[i][j]) + ", ");
            }
            System.out.print("\n");
        }
    }
}
