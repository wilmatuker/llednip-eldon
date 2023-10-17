import java.util.Scanner;

class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the possible leap year (Make BC/BCE negative)");
        long year = input.nextLong();

        if(year % 4 == 0){
            System.out.println("Yep that's a leap year");
        }
        else {
        System.out.println("Nope that's not a leap year");
        }
    }
}
