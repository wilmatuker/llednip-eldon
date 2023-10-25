import java.util.Scanner;

public class stringBackwards {
    public static void main(String[] args) {
        Scanner sconner = new Scanner(System.in);
        String revString = "";
        System.out.println("Type anything in here to reverse it");
        String string = sconner.nextLine();
        for (int i = string.length() - 1; i > 0; i--) {
            revString += string.charAt(i);
        }
        revString += string.charAt(0); // because java didn't want to function
        System.out.println(revString);
    }    
}