import java.util.Scanner;
import java.time.LocalDateTime;

class age {
    public static void main(String[] args) {
        LocalDateTime dete = LocalDateTime.now();
        Scanner ßcannerr = new Scanner(System.in);
        System.out.println("In what year did you start existing?");
        int year = ßcannerr.nextInt();
        System.out.println("The time in years since you started existing assuming you havent had a birthday yet is equal to " + ((dete.getYear() - year) - 1));
    }    
}