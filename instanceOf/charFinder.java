import java.util.Random;
import java.util.Scanner;

class charFinder {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("Enter a string");
        String string = line.nextLine();

        int charCount = 0;

        System.out.println("Enter a character you want to find in the string");
        String symbol = line.next();
        char symbol1 = symbol.charAt(0);

        if(string.contains((symbol)))
        {
            String convChar = "";
            convChar += symbol;//this is here to convert it to the right type

            for (int chari = 0; chari < string.length()-1; chari++) 
            {
                if(string.charAt(chari) == symbol1) {
                    charCount ++;
                }
            }
        } else {
                System.out.println("It's not here");
        }

        System.out.println("Character count: " + String.valueOf(charCount));
        
    }
}
