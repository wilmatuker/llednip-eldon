import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner skooner = new Scanner(System.in);
        System.out.println("What number do you want to factorialize? (Math says it must be an integer)");
        int factorial = 1;
        int num = skooner.nextInt();

        for (int i = num; i != 0; i--) {
            factorial = factorial * Math.max(i, 1);
            System.out.println(i);
        }

        System.out.println(factorial);
    }    
}