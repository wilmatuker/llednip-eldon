import java.util.Scanner;
import java.util.Random;

class guessNum {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        Random rng = new Random();
        int ans = 0;
        int num = rng.nextInt(1, 10);
        while (ans != num) {
            if(ans != num) {//should be true first time
                System.out.println("Guess a number between 1-10");
                ans = skanner.nextInt();
            }
            if (ans == num) {
                System.out.println("You got it! :D");
            } else {
                System.out.println("You didn't get it :(");
                if (ans < num) {
                    System.out.println("Higher");
                } else if (ans > num) {
                    System.out.println("Lower");
                }
            }
        }
    }    
}