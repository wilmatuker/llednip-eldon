import java.util.Scanner;

class grade {
    public static void main(String[] args) {
        Scanner skooner = new Scanner(System.in);

        System.out.println("You have an exam and its graded  with a number, but you wanna know the letter grade");
        System.out.println("What is the number grade (0-100)");
        numGrade = skooner.nextDouble() / 100;

        if (numGrade > 1) {
            System.out.println("Follow instructions please");
        } else if (numGrade >= .9) {
            System.out.println("That's an A!");
        } else if (numGrade >= .89) {
            System.out.println("That's a B");
        } else if (numGrade >= .70) {
            System.out.println("That's a C");
        } else if (numGrade >= .59) {
            System.out.println("That's a D");
        } else if (numGrade >= 0) {
            System.out.println("That's an F :(");
        } else {
            System.out.println("wat ._.");
        }

        
    }    
}