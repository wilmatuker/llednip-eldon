import java.util.Scanner;
class stupidConvert {
    public static void main(String[] args) {
        Scanner scelonner = new Scanner(System.in);
        System.out.println("You for some reason go to the fictional Glaggleland and need to convert your currency to their main system of Bintar");
        System.out.println("How much unconverted money do you eant to convert? (answer in USD)");
        double usd = scelonner.nextDouble();
        double bintar = Math.rint((usd / 10.0) * 100.0);
        bintar /= 100.0;
        System.out.println("That is ☺" + bintar + " bintar.");
    }
}