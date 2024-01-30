import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        System.out.println(facterial());
    }

    public static int facterial(){
        Scanner inpuut = new Scanner(System.in);

        System.out.print("Enter the number to be factorialized\n    > ");
        int number = inpuut.nextInt();

        for (int i = number - 1; i > 0; i--) {
            number *= i;
        }

        return number;
    }
}
