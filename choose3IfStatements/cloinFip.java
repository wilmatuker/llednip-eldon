import java.util.Random;

class cloinFip {
    public static void main(String[] args) {
        Random coin = new Random();

        int fip = coin.nextInt(2);

        if (fip == 1) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
