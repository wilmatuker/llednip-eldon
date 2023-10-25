import java.util.Random;
import java.util.random;

class cloinFip {
    public static void main(String[] args) {
        Random coin = new Random();

        int fip = coin.nextInt(0);

        if (fip == 0) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
