import java.util.Scanner;

class losDoubler {
    public static void main(String[] args) {
        Scanner skinnor = new Scanner(System.in);
        System.out.println("You put some money into Stupid Bank into their signature savings account that accures 100% intrest (hence their name)");
        System.out.println("How much money in dollars did you put into thine account (put only da number)?");
        double moolah = skinnor.nextDouble();
        System.out.println("*You got " + (moolah * 2) + "$.");
    }
}