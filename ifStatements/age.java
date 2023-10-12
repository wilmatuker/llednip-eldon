import java.util.Scanner;

class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Not to be rude, but what is your age?");
        int age = input.nextInt();

        if (age <= 0) {
            System.out.println("You havent been born if this is your actual age, please type in a positive number please");
        } else {
            if (age < 13) {
                System.out.println("You're a child.");
            } else {
                if (age < 18) {
                    System.out.println("You're a teenager");
                } else {
                    if (age < 65) {
                        System.out.println("You're an adult");
                    } else {
                        if (age < 122) {
                            System.out.println("You're a senior citizen");
                        } else {
                            System.out.println("Unless you're using this way after this is made, you're probably seeing what happens with absurdly large ages, because you'd be dead with the medical science at the time this was made");
                        }
                    }
                }
            }
        }
    }    
}