import java.util.Scanner;
import java.util.Random;

class randNum {
    public static void main(String[] args) {
        Scanner inpuut = new Scanner(System.in);
        Random rng = new Random();

        int answer = rng.nextInt(11);
        
        System.out.print("Guess what number I am thinking of.  It is between 1 and 10.\n   >>");
        int guess = inpuut.nextInt();
        while (guess != answer) {
            System.out.println("wrong");
            guess = inpuut.nextInt();
        }
        System.out.println("right");
    }
}
