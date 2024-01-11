import java.util.Scanner;

class digiSum{
    public static void main(String[] args) {
        Scanner inpuuut = new Scanner(System.in);
        
        System.out.print("Type in any number please \n    >> ");
        double number = inpuuut.nextDouble();
        long numint = 0;

        boolean isInteger = false;
        if (number % 1 == 0){
            numint = Math.round(number);
            isInteger = true;
        }

        int sum = 0;
        String digitString = "";


        if (isInteger == true) {
            digitString = String.valueOf(numint);
        }
        else {
            digitString = String.valueOf(number);
        }

        for (int c = 0; c < digitString.length(); c++) {
            sum += digitString.charAt(c) - 48;
        }

        System.out.println("The digits added together make " + sum);
    }
}
