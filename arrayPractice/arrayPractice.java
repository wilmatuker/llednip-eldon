import java.util.Scanner;

class arrayPractice {
    public static void main(String[] args) 
    {
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter the amount of things you want to print in an array (keep it at least one)");
        int size = imput.nextInt();
        imput.nextLine();

        String[] entries = new String[size];

        for (int i = 0; i < size; i++) 
        {
            System.out.println(String.valueOf(i) + "Enter some text in");
            entries[i] = imput.nextLine();
        }
        String array = "[";
        for (int i = 0; i < size; i++) {
            array += "\"";
            array += entries[i];
            array += "\"";
            if (i != size - 1) {
                array += ", ";   
            }
        }
        array += "]";
        System.out.println("The array: " + array);
    }    
}
