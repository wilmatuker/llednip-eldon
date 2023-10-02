import java.util.Scanner;

class farenheit {
    public static void main(String[] args) {
        Scanner skieoneor = new Scanner(System.in);
        System.out.println("You've never learned celsius existed so you use this to make it make sense");
        System.out.println("What is the number before the degrees C you see");
        double c = skieoneor.nextDouble();
        System.out.println("The farenheit temp is " + ((c * 1.8) + 32) + " degrees F");
    }    
}