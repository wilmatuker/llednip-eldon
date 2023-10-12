import java.util.Scanner;

import java.math.*;

class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're trying to see whether x amount of things are even or odd");
        System.out.println("How many objects do you have?");
        String num = input.nextLine();//for looking at the last char and avoiding truncation
        char lastDigit = num.charAt(num.length() - 1);
        if (lastDigit == 2 || lastDigit == 4 || lastDigit == 6 || lastDigit == 8 || lastDigit == 0) {
            System.out.println("This number is even my friend");
        } else {
            System.out.println("This number is odd my friend");
        }
    }
}
