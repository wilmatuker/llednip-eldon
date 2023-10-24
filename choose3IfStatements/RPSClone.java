import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

class RPSClone{
    public static void main(String[] args) {
        int scoreP = 0;
        int scoreC = 0;
        char choiceC;
        Random cpu = new Random();
        char[] choices = {'r', 'p', 's'};
        Scanner input = new Scanner(System.in);
        System.out.println("Hi today it's time for a rock paper scissors game with whoever wins 2 out of 3 matches is the victor");

        while (scoreC == scoreP || (scoreC < 2 && scoreP < 2)) {            
            System.out.println("Chose from rock, paper, or scissors (r, p, or s)");
            String raw = input.next().toLowerCase();
            char choice = raw.charAt(0);
            choiceC = choices[cpu.nextInt(0, 2)];
            if (choice == choiceC) {
                System.out.println("Tie!\nGoing again!");
            } else if (choice == 'r') {
                switch (choiceC) {
                    case 'p':
                        System.out.println("CPU Wins!");
                        scoreC += 1;
                        break;
                
                    case 's':
                        System.out.println("You win!");
                        scoreP += 1;
                        break;
                }
            } else if (choice == 'p') {
                switch (choiceC) {
                    case 's':
                        System.out.println("CPU Wins!");
                        scoreC += 1;
                        break;
                
                    case 'r':
                        System.out.println("You win!");
                        scoreP += 1;
                        break;
                }
            } else if (choice == 's') {
                switch (choiceC) {
                    case 'r':
                        System.out.println("CPU Wins!");
                        scoreC += 1;
                        break;
                
                    case 'p':
                        System.out.println("You win!");
                        scoreP += 1;
                        break;
                }
            } else {
                System.out.println("Try again");
            }

            System.out.println("You: " + String.valueOf(scoreP));
            System.out.println("CPU: " + String.valueOf(scoreC));           
        }

        
    }
}