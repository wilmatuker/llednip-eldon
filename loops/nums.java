import java.util.Scanner;

class nums {
    public static void main(String[] args) {
        Scanner skannear = new Scanner(System.in);
        long greatest = 0;
        long smallest = 0;
        System.out.println("How many numbers do you want to put in? (positive answers only above 0)");
        long maxNums = skannear.nextLong();
        if (maxNums > 0) {
            for (int i = 0; i <= maxNums; i++) {
                if (i <= maxNums) {
                    System.out.println("Enter a number");
                    long num = skannear.nextLong();
                    if (num > greatest) {
                        greatest = num;
                    } else if (num < smallest) {
                        smallest = num;
                    }
                }
            }
            if (greatest == smallest) {
                System.out.println("Both the greatest and smallest were the same number:");
                System.out.println(greatest);
            } else {
                System.out.println("The greatest was: " + String.valueOf(greatest));
                System.out.println("The smallest was: " + String.valueOf(smallest));
            }
        } else {
            System.out.println("Why\nno");
        }
    }    
}