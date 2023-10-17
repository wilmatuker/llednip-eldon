import java.util.Scanner;

class vowelDistinguisher{
    public static void main(String[] args) {
        Scanner ßcanner = new Scanner(System.in);

        System.out.println("Enter the letter you're not sure if it's a vowel or not (only the letter)");
        char letter = ßcanner.next().charAt(0);

        switch (letter) {
            case 'a':
                System.out.println("A vowel!");
                break;
            
            case 'e':
                System.out.println("A vowel!");
                break;

            case 'i':
                System.out.println("A vowel!");
                break;
            
            case 'o':
                System.out.println("A vowel!");
                break;

            case 'u':
                System.out.println("A vowel!");
                break;

            case 'y':
                System.out.println("This depends, look it up on google.");
                break;

            default:
                System.out.println("This is not a vowel.");
                break;
        }

    }
}
