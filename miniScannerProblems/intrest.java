import java.util.Scanner;

class intrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're at a bank with a simple intrest account");
        System.out.println("Because you want to have money you apply for it and now you want to know how much you're gonna get");
        System.out.println("How much is the rate for a year");
        double rate = scanner.nextDouble();
        System.out.println("How much do you have right now in dollars");
        double moolah = scanner.nextDouble();
        System.out.println("How much do you plan an letting it cook in the account for in years?");
        double time = scanner.nextDouble();

        double intrest = (moolah * rate* time);

        intrest = Math.rint(intrest * 100.0);
        intrest /= 100.0;
        intrest += moolah;

        System.out.println("The beautiful amount of capitalism you will have is " + intrest + "$");
    }
}