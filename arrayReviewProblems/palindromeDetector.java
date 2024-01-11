import java.util.Scanner;
import java.util.Arrays;

class palindromeDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array\n    >> ");

        int size = input.nextInt();
        input.nextLine();//consume leftover line

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter anything\n    >> ");
            array[i] = input.nextLine();
        }

        String[] revArray = new String[size];

        for (int i = 0, j = size - 1; i < size; i++, j--) {
            revArray[j] = array[i];
        }

        if (Arrays.equals(array, revArray)) {
            System.out.println("Yea thats a palindrome");
        }
        else {
            System.out.println("Thats not a palindrome");
        }
    }
}