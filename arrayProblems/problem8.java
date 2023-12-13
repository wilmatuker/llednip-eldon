import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner impuuuuuut = new Scanner(System.in);
        System.out.println("How many things do you want in the array?");
        int size = impuuuuuut.nextInt();
        impuuuuuut.nextLine();//stop consuming nextline, from https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
        String[] things = new String[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("What would you like to add to the array?");
            things[i] = impuuuuuut.nextLine();
        }

        System.out.println("What would you want to find in the array perchance?");
        String target = impuuuuuut.nextLine();//get the target var
        int j = 0;
        boolean flag = false;//to break the loop
        int index = -2;//to stare indexes, -2 to keep errors at bay
        System.out.println(size);
        while (j < size && flag == false) {
            if (target.equals(things[j])) {
                flag = true;
                index = j;
            }
            j++;
        }


        if (index >= 0) {
            System.out.println("We found " + target + " and it's index is " + String.valueOf(index) + ".");
        }
        else {
            System.out.println("We couldn't find it :(");
        }
    }
}
